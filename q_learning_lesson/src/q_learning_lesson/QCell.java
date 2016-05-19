package q_learning_lesson;

import java.util.ArrayList;
import java.util.Collections;

public class QCell {
  private double upQValue;
  private double leftQValue;
  private double rightQValue;
  private double downQValue;

  /*
   * セルのマップ上での状態
   * 何もないセル : 0
   * ゴール : 報酬の値
   */
  private int mapState;

  //コンストラクタ
  public QCell(int map_state) {
    super();
    this.setUpQValue(0);
    this.setLeftQValue(0);
    this.setRightQValue(0);
    this.setDownQValue(0);
    this.setMapState(map_state);
  }

  public double getMaxQValue(){
    ArrayList<Double> list= new ArrayList<Double>();
    list.add(upQValue);
    list.add(leftQValue);
    list.add(rightQValue);
    list.add(downQValue);
    double max = Collections.max(list);
    return max;
  }

  public double getUpQValue() {
    return upQValue;
  }

  public void setUpQValue(double upQValue) {
    this.upQValue = upQValue;
  }

  public double getLeftQValue() {
    return leftQValue;
  }

  public void setLeftQValue(double leftQValue) {
    this.leftQValue = leftQValue;
  }

  public double getRightQValue() {
    return rightQValue;
  }

  public void setRightQValue(double rightQValue) {
    this.rightQValue = rightQValue;
  }

  public double getDownQValue() {
    return downQValue;
  }

  public void setDownQValue(double downQValue) {
    this.downQValue = downQValue;
  }

  public int getMapState() {
    return mapState;
  }

  public void setMapState(int mapState) {
    this.mapState = mapState;
  }
}
