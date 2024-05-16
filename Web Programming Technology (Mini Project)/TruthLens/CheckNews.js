document.addEventListener('DOMContentLoaded', () => {
    // Load the dataset
    loadCSV('News.csv').then(data => {
        window.newsData = data;
    });
});

function loadCSV(url) {
    return fetch(url)
        .then(response => response.text())
        .then(csvText => {
            return Papa.parse(csvText, {
                header: true,
                dynamicTyping: true
            }).data;
        })
        .then(data => {
            window.newsData = data; // Store data in global variable
            return data;
        })
        .catch(error => {
            console.error("Error:", error); // Log any errors
        });
}

// Normalize text function
function normalizeText(text) {
    return text.trim().toLowerCase().replace(/[^\w\s]/g, '');
}

// Verify News function
function verifyNews() {
    const newsInput = normalizeText(document.getElementById('newsInput').value);
    console.log("Input Text:", newsInput); 

    let resultText = '';
    let resultClass = 'other';

    if (newsInput === '') {
        resultText = 'Enter some news to verify';
    } else if (!window.newsData) {
        resultText = 'News dataset is not loaded';
    } else {
        let foundMatch = false;

        // Iterate through news data to find matches
        for (let i = 0; i < window.newsData.length; i++) {
            const item = window.newsData[i];
            if (item && item.text) {
                const normalizedItemText = normalizeText(item.text);
                if (normalizedItemText === newsInput) {
                    if (item.label.toLowerCase() === 'real') {
                        resultText = 'Real News';
                        resultClass = 'real';
                    } else if (item.label.toLowerCase() === 'fake') {
                        resultText = 'Fake News';
                        resultClass = 'fake';
                    }
                    foundMatch = true;
                    break; // Exit the loop once a match is found
                }
            }
        }

        if (!foundMatch) {
            resultText = 'News not found in the dataset';
        }
    }

    const resultElement = document.getElementById('result');
    resultElement.innerText = resultText;
    resultElement.className = resultClass;
}

