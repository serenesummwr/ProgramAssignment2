# TextCounter

TextCounter is a Java program that reads a text file and provides various statistics about the content of the file, such as character count, palindrome count, token count, emoticon count, and more.

## Features

- Counts the total number of characters in the file.
- Counts the total number of palindromes.
- Counts the total number of tokens (words).
- Counts the total number of emoticons.
- Counts the total number of new lines.
- Determines the longest token size.
- Calculates the average token size.
- Measures the execution time of the program.

## Usage

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/TextCounter.git
    ```

2. Navigate to the project directory:
    ```sh
    cd TextCounter
    ```

3. Compile the Java program:
    ```sh
    javac TextCounter.java
    ```

4. Run the program with the path to your input file:
    ```sh
    java TextCounter /path/to/your/inputfile.txt
    ```

## Example

To run the program with an example input file located at `/Users/natthapoom/Downloads/input1.txt`, use the following command:
```sh
java TextCounter /Users/natthapoom/Downloads/input1.txt
```

## Methods

- `isPalindrome(String word)`: Checks if a given word is a palindrome.
- `isEmoticon(String word)`: Checks if a given word is an emoticon.
- `printResults(int charCount, int palindromeCount, int tokenCount, int newLineCount, int longestToken, double avgTokenSize, int emoticonCount, double executionTime)`: Prints the results of the analysis.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## Author

672115011 Natthapoom Saengkaew
