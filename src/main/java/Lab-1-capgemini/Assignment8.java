package core_java;
class Assignment8 {
    public static void main(String[] args) {
        System.out.println(powerOf2(1));
    }

    private static boolean powerOf2(int number){
        if(number<=0){
            return false;
        }

        while(number > 1){
            if(number % 2 != 0){
                return false;
            }
            number = number / 2;
        }
        return true;
    }

}