package com.rcyyd.bookdinner.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.codec.digest.DigestUtils;

public final class CommonUtil {
	
	private static final String allChars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String DATE_PATTERN = "yyyy年MM月dd日";
	private static final String TIME_PATTERN = "HH:mm:ss";
	
	private static SimpleDateFormat dateFormatter = null;
	private static SimpleDateFormat timeFormatter = null;
	
	static {
		dateFormatter = new SimpleDateFormat(DATE_PATTERN);
		timeFormatter = new SimpleDateFormat(TIME_PATTERN);
	}
	
	private CommonUtil() {
		throw new AssertionError();
	}
	
	public static String formatDate(Date date) {
		return dateFormatter.format(date);
	}
	
	public static String formatTime(Date date) {
		return timeFormatter.format(date);
	}
	
	public static String generateVC(int length) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; ++i) {
			int index = (int) (Math.random() * allChars.length());
			sb.append(allChars.charAt(index));
		}
		return sb.toString();
	}
	
	public static Color randomColor() {
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		return new Color(red, green, blue);
	}
	
	public static BufferedImage getImageFromVC(String vc, int width, int height) {
		BufferedImage vcImage = new BufferedImage(width, height, 1);
		Graphics2D g = (Graphics2D) vcImage.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, width, height);
		int size = (width - 20) / vc.length();
		g.setFont(new Font("Arial", Font.BOLD, height - 4));	
		for (int i = 0; i < vc.length(); ++i) {
			String currentChar = vc.substring(i, i + 1);
			g.setColor(randomColor());
			double theta = (Math.random() * 31 - 15) / 180.0;
			g.rotate(theta);
			g.drawString(currentChar, 10 + i * size, height / 2 + 10);
			g.rotate(-theta);
		}
		for (int i = 0; i < 20; ++i) {
			int x1 = (int) (Math.random() * width);
			int y1 = (int) (Math.random() * height);
			int x2 = (int) (Math.random() * width);
			int y2 = (int) (Math.random() * height);
			g.setColor(randomColor());
			g.drawLine(x1, y1, x2, y2);
		}
		return vcImage;
	}
	
	public static String getFilenameWithoutSuffix(String filename) {
		int pos = filename.lastIndexOf(".");
		return pos > 0 ? filename.substring(0, pos) : filename;
	}
	
	/**
	 * 取出文件名中的后缀名
	 * @param filename 文件名
	 * @return 后缀名
	 */
	public static String getSuffix(String filename) {
		int pos = filename.lastIndexOf(".");
		return pos > 0 && filename.length() > 2 ? filename.substring(pos) : null;
	}
	
	/**
	 * 获得基于MD5摘要的文件名
	 * @param input 文件输入流
	 * @param suffix 文件后缀名
	 * @return MD5摘要形式的文件名
	 * @throws IOException 
	 */
	public static String getMd5Filename(InputStream input, String suffix) throws IOException {
		String md5 = DigestUtils.md5Hex(input);
		return md5 + (suffix != null ? suffix : "");
	}
}
