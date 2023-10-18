public class Prime {

  public static void main(String args[]) {
    int high = 100, low = 10;
    primeInRange(low, high);
  }

  static void primeInRange(int low, int high) {
    if (low <= 1 || high<=1) {
      return;
    }
    for (int i = low; i <= high; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }

  static boolean isPrime(int num) {
    if (num % 2 == 0 || num % 3 == 0) {
      return false;
    }
    for (int i = 5; i * i <= num; i += 6) {
      if (num % i == 0 || num % (i + 2) == 0) {
        return false;
      }
    }
    return true;
  }
}

//Actual Output: 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 