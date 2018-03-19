package com.wode.stock.Util;

import java.text.DecimalFormat;

public class NumberFormat
{
  private static DecimalFormat TWO_DECIMAL_FORMAT = new DecimalFormat("##0.00");

  /**
   * 格式化小数，四舍五入保留两位小数
   * 
   * @param number
   *          要四舍五入的小数
   * @return
   */
  public static String decimalFormat(float number)
  {
    return TWO_DECIMAL_FORMAT.format(number);
  }
}
