#include <unordered_map>
#include <sstream>
#include <vector>
#include <string>

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        stringstream iss(s);
        vector<string> words;
        string word;
        while (iss >> word) {
            words.push_back(word);
        }
        if (pattern.length() != words.size()) {
            return false;
        }
        unordered_map<char, string> patternToWord;
        unordered_map<string, char> wordToPattern;

        for (int i = 0; i < pattern.length(); ++i) {
            char pChar = pattern[i];
            string w = words[i];
            if (patternToWord.find(pChar) != patternToWord.end()) {
                if (patternToWord[pChar] != w) {
                    return false; 
                }
            } else {
                patternToWord[pChar] = w;
            }
            if (wordToPattern.find(w) != wordToPattern.end()) {
                if (wordToPattern[w] != pChar) {
                    return false; 
                }
            } else {
                wordToPattern[w] = pChar;
            }
        }

        return true;
    }
};
