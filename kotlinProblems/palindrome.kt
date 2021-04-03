/*
 * Your task is to implement a palindrome test.
 *
 * A string is called a palindrome when it reads the same way left-to-right
 * and right-to-left.
 *
 * See http://en.wikipedia.org/wiki/Palindrome
 */
package palindrome

fun isPalindrome(s: String): Boolean {
    return s.withIndex().all { 
        (index, value) -> value == s[s.length - index - 1] 
    }
}
    
