package com.smsoft.thisisjava.ch11exception.ex03;

public class OutOfBoundExam {
    public static void main(String[] args) {
        String[] arr = {"100", "1oo"};

        for (int i=0; i<=arr.length; i++) {
            try {
                int value = Integer.parseInt(arr[i]);
                System.out.println("array[" + i + "]" + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨 : " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환 할 수 없음 : " + e.getMessage());
            } catch (Exception e) {     // 상위 예외 클래스는 아래쪽으로
                System.out.println("실행에 문제가 있습니다 : " + e.getMessage());
            }
        }
    }
}
