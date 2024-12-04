const fs = require('fs');

/**
 * Writes content to a file.
 * @param {string} filePath - Path to the file.
 * @param {string} content - Content to write.
 */
function writeToFile(filePath, content) {
    fs.writeFileSync(filePath, content, 'utf-8');
}

/**
 * Reads content from a file.
 * @param {string} filePath - Path to the file.
 * @returns {string} - File content.
 */
function readFromFile(filePath) {
    return fs.readFileSync(filePath, 'utf-8');
}

/**
 * Counts the number of lines in a file.
 * @param {string} filePath - Path to the file.
 * @returns {number} - Number of lines.
 */
function countLinesInFile(filePath) {
    const content = fs.readFileSync(filePath, 'utf-8');
    return content.split('\n').length;
}

module.exports = { writeToFile, readFromFile, countLinesInFile };
