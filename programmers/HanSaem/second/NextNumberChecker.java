package programmers.second;

public class NextNumberChecker {
  
  public int solution(int n) {
    int origin = n;
    int compareNum = n;
    while(true) {
      int count = 0;
      int compareCount = 0;
      String binaryParam = Integer.toBinaryString(origin);
      String compareBinary = Integer.toBinaryString(++compareNum);
      
      for(int i=0; i<binaryParam.length(); i++) {
        if(binaryParam.charAt(i) == '1') {
          count++;
        }
      }
      
      for(int i=0; i<compareBinary.length(); i++) {
        if(compareBinary.charAt(i) == '1') {
          compareCount++;
        }
      }
      
      if(count == compareCount) {
        return compareNum;
      }
    }
  }
  
  public static void main(String[] args) {
    int no = 78;
    System.out.println(no + "의 다음 큰 숫자는 " + new NextNumberChecker().solution(no) + "입니다.");
  }
}
