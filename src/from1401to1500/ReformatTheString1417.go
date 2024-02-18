package main

/*
You are given an alphanumeric string s. (Alphanumeric string is a string consisting of lowercase English letters and digits).

You have to find a permutation of the string where no letter is followed by another letter and no digit is followed by another digit. That is, no two adjacent characters have the same type.

Return the reformatted string or return an empty string if it is impossible to reformat the string.

Example 1:

Input: s = "a0b1c2"
Output: "0a1b2c"
Explanation: No two adjacent characters have the same type in "0a1b2c". "a0b1c2", "0a1b2c", "0c2a1b" are also valid permutations.
Example 2:

Input: s = "leetcode"
Output: ""
Explanation: "leetcode" has only characters so we cannot separate them by digits.
Example 3:

Input: s = "1229857369"
Output: ""
Explanation: "1229857369" has only digits so we cannot separate them by characters.

Constraints:

1 <= s.length <= 500
s consists of only lowercase English letters and/or digits.
*/
func main() {
	reformat("covid2019")
}

func reformat(s string) string {
	stringLength := len(s)
	if stringLength <= 1 {
		return s
	}

	var digits, letters []string

	for _, char := range s {
		if char >= '0' && char <= '9' {
			digits = append(digits, string(char))
		} else {
			letters = append(letters, string(char))
		}
	}

	if len(digits) == 0 || len(letters) == 0 {
		return ""
	}

	lettersHigherThanDigits := len(letters) == len(digits)+1
	digitsHigherThanLetters := len(digits) == len(letters)+1

	if digitsHigherThanLetters || len(letters) == len(digits) {
		finalString := ""
		digitsCounter, lettersCounter := 0, 0
		for i := 0; i < stringLength; i++ {
			if i%2 == 0 {
				finalString += digits[digitsCounter]
				digitsCounter++
			} else {
				finalString += letters[lettersCounter]
				lettersCounter++
			}
		}
		return finalString
	}

	if lettersHigherThanDigits {
		finalString := ""
		digitsCounter, lettersCounter := 0, 0
		for i := 0; i < stringLength; i++ {
			if i%2 == 0 {
				finalString += letters[lettersCounter]
				lettersCounter++
			} else {
				finalString += digits[digitsCounter]
				digitsCounter++
			}
		}
		return finalString
	}

	return ""
}
