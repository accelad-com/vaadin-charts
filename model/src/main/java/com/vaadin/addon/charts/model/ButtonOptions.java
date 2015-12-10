package com.vaadin.addon.charts.model;

import com.vaadin.addon.charts.model.style.Color;
/**
 * A collection of options for buttons appearing in the exporting module.
 */
public class ButtonOptions extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private String align;
	private Boolean enabled;
	private Number height;
	private Color symbolFill;
	private Number symbolSize;
	private Color symbolStroke;
	private Number symbolStrokeWidth;
	private Number symbolX;
	private Number symbolY;
	private String text;
	private Object theme;
	private String verticalAlign;
	private Number width;
	private Number y;

	public ButtonOptions() {
	}

	/**
	 * @see #setAlign(String)
	 */
	public String getAlign() {
		return align;
	}

	/**
	 * Alignment for the buttons.
	 * <p>
	 * Defaults to: right
	 */
	public void setAlign(String align) {
		this.align = align;
	}

	public ButtonOptions(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Whether to enable buttons.
	 * <p>
	 * Defaults to: true
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setHeight(Number)
	 */
	public Number getHeight() {
		return height;
	}

	/**
	 * Pixel height of the buttons.
	 * <p>
	 * Defaults to: 20
	 */
	public void setHeight(Number height) {
		this.height = height;
	}

	/**
	 * @see #setSymbolFill(Color)
	 */
	public Color getSymbolFill() {
		return symbolFill;
	}

	/**
	 * Fill color for the symbol within the button.
	 * <p>
	 * Defaults to: #E0E0E0
	 */
	public void setSymbolFill(Color symbolFill) {
		this.symbolFill = symbolFill;
	}

	/**
	 * @see #setSymbolSize(Number)
	 */
	public Number getSymbolSize() {
		return symbolSize;
	}

	/**
	 * The pixel size of the symbol on the button.
	 * <p>
	 * Defaults to: 14
	 */
	public void setSymbolSize(Number symbolSize) {
		this.symbolSize = symbolSize;
	}

	/**
	 * @see #setSymbolStroke(Color)
	 */
	public Color getSymbolStroke() {
		return symbolStroke;
	}

	/**
	 * The color of the symbol's stroke or line.
	 * <p>
	 * Defaults to: #666
	 */
	public void setSymbolStroke(Color symbolStroke) {
		this.symbolStroke = symbolStroke;
	}

	/**
	 * @see #setSymbolStrokeWidth(Number)
	 */
	public Number getSymbolStrokeWidth() {
		return symbolStrokeWidth;
	}

	/**
	 * The pixel stroke width of the symbol on the button.
	 * <p>
	 * Defaults to: 1
	 */
	public void setSymbolStrokeWidth(Number symbolStrokeWidth) {
		this.symbolStrokeWidth = symbolStrokeWidth;
	}

	/**
	 * @see #setSymbolX(Number)
	 */
	public Number getSymbolX() {
		return symbolX;
	}

	/**
	 * The x position of the center of the symbol inside the button.
	 * <p>
	 * Defaults to: 12.5
	 */
	public void setSymbolX(Number symbolX) {
		this.symbolX = symbolX;
	}

	/**
	 * @see #setSymbolY(Number)
	 */
	public Number getSymbolY() {
		return symbolY;
	}

	/**
	 * The y position of the center of the symbol inside the button.
	 * <p>
	 * Defaults to: 10.5
	 */
	public void setSymbolY(Number symbolY) {
		this.symbolY = symbolY;
	}

	public ButtonOptions(String text) {
		this.text = text;
	}

	/**
	 * @see #setText(String)
	 */
	public String getText() {
		return text;
	}

	/**
	 * A text string to add to the individual button.
	 * <p>
	 * Defaults to: null
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @see #setTheme(Object)
	 */
	public Object getTheme() {
		return theme;
	}

	/**
	 * A configuration object for the button theme. The object accepts SVG
	 * properties like <code>stroke-width</code>, <code>stroke</code> and
	 * <code>fill</code>. Tri-state button styles are supported by the
	 * <code>states.hover</code> and <code>states.select</code> objects.
	 * <p>
	 * Defaults to:
	 */
	public void setTheme(Object theme) {
		this.theme = theme;
	}

	/**
	 * @see #setVerticalAlign(String)
	 */
	public String getVerticalAlign() {
		return verticalAlign;
	}

	/**
	 * The vertical alignment of the buttons. Can be one of "top", "middle" or
	 * "bottom".
	 * <p>
	 * Defaults to: top
	 */
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	/**
	 * @see #setWidth(Number)
	 */
	public Number getWidth() {
		return width;
	}

	/**
	 * The pixel width of the button.
	 * <p>
	 * Defaults to: 24
	 */
	public void setWidth(Number width) {
		this.width = width;
	}

	/**
	 * @see #setY(Number)
	 */
	public Number getY() {
		return y;
	}

	/**
	 * The vertical offset of the button's position relative to its
	 * <code>verticalAlign</code>. .
	 * <p>
	 * Defaults to: 0
	 */
	public void setY(Number y) {
		this.y = y;
	}
}