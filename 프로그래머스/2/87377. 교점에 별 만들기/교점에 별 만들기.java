import java.util.*;

public class Solution {
    
  private static class Point { // 좌표를 나타내는 클래스
    public final long x, y; 
    // final 사용해 불변성을 가지게 하고, 생성자로 초기화 할 수 있게 함

    private Point(long x, long y) {
      this.x = x;
      this.y = y;
    }
  }
    
    
  private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) { // 직선의 교점을 찾기 위한 메서드

    // x 값 = 교점 구하는 공식
    double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
    // y 값 = 교점 구하는 공식
    double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

    if (x % 1 != 0 || y % 1 != 0) // 만약 정수가 아니라면 
      return null; // null 값 반환해라

    return new Point((long) x, (long) y); // 위 if 문 통과시 x,y 교점 좌표 
  }

  private Point getMinimumPoint(List<Point> points) {
      // getMinimumPoint() 메서드는 
      // points 리스트 안 모든 Point 객체를 순회하면서 가장 작은
      // x, y 값을 찾고 그 값을 사용해 Point 객체 만들어 반환
    long x = Long.MAX_VALUE;
    // MAX_VALUE 란?
    // 데이터 타입이 표현할 수 있는 숫자의 범위 중 가장 큰 숫자와
    // 가장 큰 숫자의 값이 할당
    long y = Long.MAX_VALUE;
      
    // points 리스트 안 모든 Point 객체를 순회하면서 가장 작은
    // x, y 값을 찾고 그 값을 사용해 Point 객체 만들어 반환
    for (Point p : points) {
      if (p.x < x)
        x = p.x;
      if (p.y < y)
        y = p.y;
    }
    return new Point(x, y);
  }

  private Point getMaximumPoint(List<Point> points) {
      // getMaximumPoint() 메서드는 
      // points 리스트 안 모든 Point 객체를 순회하면서 가장 큰
      // x, y 값을 찾고 그 값을 사용해 Point 객체 만들어 반환
      
    long x = Long.MIN_VALUE;
    // MIN_VALUE 란?
    // 데이터 타입이 표현할 수 있는 숫자의 범위 중 가장 작은 숫자와
    // 가장 작은 숫자의 값이 할당
    long y = Long.MIN_VALUE;

    for (Point p : points) {
      if (p.x > x)
        x = p.x;
      if (p.y > y)
        y = p.y;
    }
    return new Point(x, y);
  }

  public String[] solution(int[][] line){
      // 정수 좌표일 때 Point 객체로 반환되므로
      // 좌표를 저장할 리스트를 만들고, 객체가 반환되었을 때만 리스트에 저장
    List<Point> points = new ArrayList<>();
    
    // 모든 직선 쌍에 대해 반복  
    for (int i = 0; i < line.length; i++) {
      for (int j = i + 1; j < line.length; j++){
        Point intersection = // 행렬 , 2 차원 배열은 열 행 인걸 인지하자
            intersection(line[i][0], line[i][1], line[i][2], 
                         line[j][0], line[j][1], line[j][2]);

        if (intersection != null) {
          points.add(intersection);
        }
      }
    }
    // 2 차원의 배열의 크기 구하기
    Point minimum = getMinimumPoint(points);
    Point maximum = getMaximumPoint(points);
    // 배열의 크기를 구해야 하기 때문에 + 1
    int width = (int) (maximum.x - minimum.x + 1);
    int height = (int) (maximum.y - minimum.y + 1);

    // 2 차원 배열 선언하고 초기화
    // 문자를 이용하여 각 좌표를 표시하기 때문에 char 자료형 사용해 2차원 배열 선언
    // ****** 2 차원 배열은 y 축 부터 접근함 *******
    char[][] arr = new char[height][width];

    for (char[] row : arr) {
      Arrays.fill(row, '.');
    }

    // 결정된 minimum, maximum 크기로
    // 좌표 변환과 변환된 좌표로 별 찍기
    for (Point p : points) {
      int x = (int) (p.x - minimum.x);
      int y = (int) (maximum.y - p.y);
      arr[y][x] = '*';
    }
    
    // String 배열로 반환하여 반환
    // String 배열을 선언한 후 2 차원 배열을 구성하는 1 차원 배열들은
    // String 으로 반환
    String[] result = new String[arr.length];
    for (int i = 0; i < result.length; i++) {
      result[i] = new String(arr[i]);
    }
    return result;
  }

}