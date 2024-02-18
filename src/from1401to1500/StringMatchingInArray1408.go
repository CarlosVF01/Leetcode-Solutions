package main

import "strings"

func main() {

}

func stringMatching(words []string) []string {
	matchingStrings := make([]string, 0, len(words))

	for i := 0; i < len(words); i++ {
		for j := 0; j < len(words); j++ {
			if strings.Contains(words[j], words[i]) && words[i] != words[j] {
				matchingStrings = append(matchingStrings, words[i])
				break

			}
		}
	}
	return matchingStrings
}
