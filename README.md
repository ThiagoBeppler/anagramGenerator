# Anagram Generator

## Overview

The `generateAnagrams` method generates all possible anagrams of a given input string using a backtracking algorithm. It ensures input validation and handles edge cases effectively.

## Features

- **Input Validation**:
    - Throws an `IllegalArgumentException` if the input is `null` or empty, with the message: "Input must be a non-empty string."
    - Throws an `IllegalArgumentException` if the input contains non-alphabetic characters, with the message: "Input must contain only alphabetic letters."

- **Algorithm**:
    - Uses a backtracking approach to generate all permutations of the input string.
    - Tracks used characters with a `boolean` array to avoid duplicates in the current path.

- **Result**:
    - Returns a list of all generated anagrams.

## How It Works

1. **Initialization**:
    - Creates an empty list `result` to store the generated anagrams.
    - Initializes a `boolean` array `used` to track which characters have been used.

2. **Backtracking**:
    - Recursively builds anagrams by:
        - Adding unused characters to the current path.
        - Marking characters as used.
        - Removing characters from the path (backtracking) to explore other combinations.

3. **Output**:
    - Returns the list of all generated anagrams.
