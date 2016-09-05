# https://www.hackerrank.com/challenges/anagram
# Enter your code here. Read input from STDIN. Print output to STDOUT

num_cases = int(raw_input())

for i in range(num_cases):
    test_case = raw_input()
    if len(test_case) % 2 == 0:
        total_sum = 0
        left_word = [i for i in test_case[0:len(test_case)/2]]
        right_word = [i for i in test_case[len(test_case)/2:len(test_case)]]
        for w in left_word:
            if w in right_word:
                right_word.remove(w)
        print len(right_word)

    else:
        print -1
