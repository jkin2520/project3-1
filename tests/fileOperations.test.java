const fs = require('fs');
const path = require('path');
const { writeToFile, readFromFile, countLinesInFile } = require('../fileOperations');

const testFilePath = path.join(__dirname, 'testFile.txt');

describe('File Operations', () => {
    afterEach(() => {
        if (fs.existsSync(testFilePath)) {
            fs.unlinkSync(testFilePath);
        }
    });

    test('writeToFile should write content to the specified file', () => {
        writeToFile(testFilePath, 'Hello, World!');
        const content = fs.readFileSync(testFilePath, 'utf-8');
        expect(content).toBe('Hello, World!');
    });

    test('readFromFile should return content from the specified file', () => {
        fs.writeFileSync(testFilePath, 'Test Content');
        const content = readFromFile(testFilePath);
        expect(content).toBe('Test Content');
    });

    test('countLinesInFile should return the number of lines in the file', () => {
        fs.writeFileSync(testFilePath, 'Line 1\nLine 2\nLine 3');
        const lineCount = countLinesInFile(testFilePath);
        expect(lineCount).toBe(3);
    });
});
