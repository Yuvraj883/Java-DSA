class Solution {

  public int[] sumZero(int n) {
    int[] arr = new int[n];
    int num = -(n / 2);

    for (int i = 0; i < n; i++) {
      if (n % 2 == 0) {
        if (num == 0) {
          num = num + 1;
          arr[i] = num;
          num = num + 1;
        } else {
          arr[i] = num;
          num = num + 1;
        }
      } else {
        arr[i] = num;

        num = num + 1;
      }
    }
    return arr;
  }
}
