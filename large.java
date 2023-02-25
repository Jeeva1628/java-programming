public int 
  findKthElementByQuickSelect(Integer[] arr, int left, int right, int k) {
    if (k >= 0 && k <= right - left + 1) {
        int pos = partition(arr, left, right);
        if (pos - left == k) {
            return arr[pos];
        }
        if (pos - left > k) {
            return findKthElementByQuickSelect(arr, left, pos - 1, k);
        }
        return findKthElementByQuickSelect(arr, pos + 1,
          right, k - pos + left - 1);
    }
    return 0;
}