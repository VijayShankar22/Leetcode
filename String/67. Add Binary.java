class Solution {
    public String addBinary(String a, String b) {
        StringBuilder mystr = new StringBuilder();
    int carry = 0;
    int A1 = a.length() - 1;
    int B1 = b.length() - 1;

    while (A1 >= 0 || B1 >= 0 || carry == 1) {
      if (A1 >= 0)
        carry += a.charAt(A1--) - '0';
      if (B1 >= 0)
        carry += b.charAt(B1--) - '0';
      mystr.append(carry % 2);
      carry /= 2;
    }
    return mystr.reverse().toString();
    }
}
