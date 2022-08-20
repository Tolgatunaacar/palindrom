public class palindrom {
    static boolean isPalindrom(int num){
        int temp = num, reverseNum=0,lastDigit=0;
        while (temp!=0){
            lastDigit = temp%10;
            reverseNum = (reverseNum*10)+lastDigit;
            temp /=10;
        }
        if (num == reverseNum) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(1001));
    }
}
