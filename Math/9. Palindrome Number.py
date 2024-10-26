class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        orignal_num = x
        reversed_num = 0

        while x != 0:
            r = x % 10
            reversed_num = reversed_num * 10 + r
            x = x // 10
        return orignal_num == reversed_num
        
