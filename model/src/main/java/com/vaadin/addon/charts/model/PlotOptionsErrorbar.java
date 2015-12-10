package com.vaadin.addon.charts.model;

import com.vaadin.addon.charts.model.style.Color;
import java.util.ArrayList;
import java.util.Arrays;
import com.vaadin.addon.charts.util.SizeWithUnit;
import java.util.Date;
import com.vaadin.addon.charts.util.Util;
/**
 * Error bars are a graphical representation of the variability of data and are
 * used on graphs to indicate the error, or uncertainty in a reported
 * measurement.
 */
public class PlotOptionsErrorbar extends AbstractPlotOptions {

	private static final long serialVersionUID = 1L;
	private Boolean allowPointSelect;
	private Color color;
	private Boolean colorByPoint;
	private Object colors;
	private String cursor;
	private Number depth;
	private Color edgeColor;
	private Number edgeWidth;
	private Boolean enableMouseTracking;
	private Boolean getExtremesFromAll;
	private Number groupZPadding;
	private ArrayList<String> keys;
	private Number lineWidth;
	private String linkedTo;
	private Number maxPointWidth;
	private Color negativeColor;
	private Number pointInterval;
	private String pointIntervalUnit;
	private Number pointPadding;
	private Object pointPlacement;
	private Number pointRange;
	private Number pointStart;
	private Number pointWidth;
	private Boolean selected;
	private States states;
	private Color stemColor;
	private String stemDashStyle;
	private Number stemWidth;
	private Boolean stickyTracking;
	private Tooltip tooltip;
	private Number turboThreshold;
	private Boolean visible;
	private Color whiskerColor;
	private String whiskerLength;
	private Number whiskerWidth;
	private String zoneAxis;
	private ArrayList<Zones> zones;

	public PlotOptionsErrorbar() {
	}

	@Override
	public ChartType getChartType() {
		return ChartType.ERRORBAR;
	}

	/**
	 * @see #setAllowPointSelect(Boolean)
	 */
	public Boolean getAllowPointSelect() {
		return allowPointSelect;
	}

	/**
	 * Allow this series' points to be selected by clicking on the markers, bars
	 * or pie slices.
	 * <p>
	 * Defaults to: false
	 */
	public void setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
	}

	/**
	 * @see #setColor(Color)
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * The main color of the bars. This can be overridden by <a
	 * href="#plotOptions.errorbar.stemColor">stemColor</a> and <a
	 * href="#plotOptions.errorbar.whiskerColor">whiskerColor</a> individually.
	 * <p>
	 * Defaults to: #000000
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @see #setColorByPoint(Boolean)
	 */
	public Boolean getColorByPoint() {
		return colorByPoint;
	}

	/**
	 * When using automatic point colors pulled from the
	 * <code>options.colors</code> collection, this option determines whether
	 * the chart should receive one color per series or one color per point.
	 * <p>
	 * Defaults to: false
	 */
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
	}

	/**
	 * @see #setColors(Object)
	 */
	public Object getColors() {
		return colors;
	}

	/**
	 * A series specific or series type specific color set to apply instead of
	 * the global <a href="#colors">colors</a> when <a
	 * href="#plotOptions.column.colorByPoint">colorByPoint</a> is true.
	 * <p>
	 * Defaults to:
	 */
	public void setColors(Object colors) {
		this.colors = colors;
	}

	/**
	 * @see #setCursor(String)
	 */
	public String getCursor() {
		return cursor;
	}

	/**
	 * You can set the cursor to "pointer" if you have click events attached to
	 * the series, to signal to the user that the points and lines can be
	 * clicked.
	 */
	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	/**
	 * @see #setDepth(Number)
	 */
	public Number getDepth() {
		return depth;
	}

	/**
	 * Depth of the columns in a 3D column chart. Requires
	 * <code>highcharts-3d.js</code>.
	 * <p>
	 * Defaults to: 25
	 */
	public void setDepth(Number depth) {
		this.depth = depth;
	}

	/**
	 * @see #setEdgeColor(Color)
	 */
	public Color getEdgeColor() {
		return edgeColor;
	}

	/**
	 * 3D columns only. The color of the edges. Similar to
	 * <code>borderColor</code>, except it defaults to the same color as the
	 * column.
	 * <p>
	 * Defaults to:
	 */
	public void setEdgeColor(Color edgeColor) {
		this.edgeColor = edgeColor;
	}

	/**
	 * @see #setEdgeWidth(Number)
	 */
	public Number getEdgeWidth() {
		return edgeWidth;
	}

	/**
	 * 3D columns only. The width of the colored edges.
	 * <p>
	 * Defaults to: 1
	 */
	public void setEdgeWidth(Number edgeWidth) {
		this.edgeWidth = edgeWidth;
	}

	/**
	 * @see #setEnableMouseTracking(Boolean)
	 */
	public Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	/**
	 * Enable or disable the mouse tracking for a specific series. This includes
	 * point tooltips and click events on graphs and points. For large datasets
	 * it improves performance.
	 * <p>
	 * Defaults to: true
	 */
	public void setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
	}

	/**
	 * @see #setGetExtremesFromAll(Boolean)
	 */
	public Boolean getGetExtremesFromAll() {
		return getExtremesFromAll;
	}

	/**
	 * Whether to use the Y extremes of the total chart width or only the zoomed
	 * area when zooming in on parts of the X axis. By default, the Y axis
	 * adjusts to the min and max of the visible data. Cartesian series only.
	 * <p>
	 * Defaults to: false
	 */
	public void setGetExtremesFromAll(Boolean getExtremesFromAll) {
		this.getExtremesFromAll = getExtremesFromAll;
	}

	/**
	 * @see #setGroupZPadding(Number)
	 */
	public Number getGroupZPadding() {
		return groupZPadding;
	}

	/**
	 * The spacing between columns on the Z Axis in a 3D chart. Requires
	 * <code>highcharts-3d.js</code>.
	 * <p>
	 * Defaults to: 1
	 */
	public void setGroupZPadding(Number groupZPadding) {
		this.groupZPadding = groupZPadding;
	}

	public String[] getKeys() {
		String[] arr = new String[keys.size()];
		keys.toArray(arr);
		return arr;
	}

	public void setKeys(String... keys) {
		this.keys = new ArrayList<String>(Arrays.asList(keys));
	}

	public void addKey(String key) {
		if (this.keys == null) {
			this.keys = new ArrayList<String>();
		}
		this.keys.add(key);
	}

	public void removeKey(String key) {
		this.keys.remove(key);
	}

	/**
	 * @see #setLineWidth(Number)
	 */
	public Number getLineWidth() {
		return lineWidth;
	}

	/**
	 * The width of the line surrounding the box. If any of <a
	 * href="#plotOptions.boxplot.stemWidth">stemWidth</a>, <a
	 * href="#plotOptions.boxplot.medianWidth">medianWidth</a> or <a
	 * href="#plotOptions.boxplot.whiskerWidth">whiskerWidth</a> are
	 * <code>null</code>, the lineWidth also applies to these lines.
	 * <p>
	 * Defaults to: 1
	 */
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
	}

	/**
	 * @see #setLinkedTo(String)
	 */
	public String getLinkedTo() {
		return linkedTo;
	}

	/**
	 * The parent series of the error bar. The default value links it to the
	 * previous series. Otherwise, use the id of the parent series.
	 * <p>
	 * Defaults to: :previous
	 */
	public void setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
	}

	/**
	 * @see #setMaxPointWidth(Number)
	 */
	public Number getMaxPointWidth() {
		return maxPointWidth;
	}

	/**
	 * The maximum allowed pixel width for a column, translated to the height of
	 * a bar in a bar chart. This prevents the columns from becoming too wide
	 * when there is a small number of points in the chart.
	 * <p>
	 * Defaults to: null
	 */
	public void setMaxPointWidth(Number maxPointWidth) {
		this.maxPointWidth = maxPointWidth;
	}

	/**
	 * @see #setNegativeColor(Color)
	 */
	public Color getNegativeColor() {
		return negativeColor;
	}

	/**
	 * The color for the parts of the graph or points that are below the <a
	 * href="#plotOptions.series.threshold">threshold</a>.
	 * <p>
	 * Defaults to: null
	 */
	public void setNegativeColor(Color negativeColor) {
		this.negativeColor = negativeColor;
	}

	/**
	 * @see #setPointInterval(Number)
	 */
	public Number getPointInterval() {
		return pointInterval;
	}

	/**
	 * <p>
	 * If no x values are given for the points in a series, pointInterval
	 * defines the interval of the x values. For example, if a series contains
	 * one value every decade starting from year 0, set pointInterval to 10.
	 * </p>
	 * <p>
	 * Since Highcharts 4.1, it can be combined with
	 * <code>pointIntervalUnit</code> to draw irregular intervals.
	 * </p>
	 * <p>
	 * Defaults to: 1
	 */
	public void setPointInterval(Number pointInterval) {
		this.pointInterval = pointInterval;
	}

	/**
	 * @see #setPointIntervalUnit(String)
	 */
	public String getPointIntervalUnit() {
		return pointIntervalUnit;
	}

	/**
	 * On datetime series, this allows for setting the <a
	 * href="plotOptions.series.pointInterval">pointInterval</a> to the two
	 * irregular time units, <code>month</code> and <code>year</code>. Combine
	 * it with <code>pointInterval</code> to draw quarters, 6 months, 10 years
	 * etc.
	 */
	public void setPointIntervalUnit(String pointIntervalUnit) {
		this.pointIntervalUnit = pointIntervalUnit;
	}

	/**
	 * @see #setPointPadding(Number)
	 */
	public Number getPointPadding() {
		return pointPadding;
	}

	/**
	 * Padding between each column or bar, in x axis units.
	 * <p>
	 * Defaults to: 0.1
	 */
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
	}

	/**
	 * @see #setPointPlacement(Object)
	 */
	public Object getPointPlacement() {
		return pointPlacement;
	}

	/**
	 * <p>
	 * Possible values: <code>null</code>, <code>"on"</code>,
	 * <code>"between"</code>.
	 * </p>
	 * <p>
	 * In a column chart, when pointPlacement is <code>"on"</code>, the point
	 * will not create any padding of the X axis. In a polar column chart this
	 * means that the first column points directly north. If the pointPlacement
	 * is <code>"between"</code>, the columns will be laid out between ticks.
	 * This is useful for example for visualising an amount between two points
	 * in time or in a certain sector of a polar chart.
	 * </p>
	 * <p>
	 * Since Highcharts 3.0.2, the point placement can also be numeric, where 0
	 * is on the axis value, -0.5 is between this value and the previous, and
	 * 0.5 is between this value and the next. Unlike the textual options,
	 * numeric point placement options won't affect axis padding.
	 * </p>
	 * <p>
	 * Note that pointPlacement needs a <a
	 * href="#plotOptions.series.pointRange">pointRange</a> to work. For column
	 * series this is computed, but for line-type series it needs to be set.
	 * </p>
	 * <p>
	 * Defaults to <code>null</code> in cartesian charts, <code>"between"</code>
	 * in polar charts.
	 */
	public void setPointPlacement(Object pointPlacement) {
		this.pointPlacement = pointPlacement;
	}

	/**
	 * @see #setPointRange(Number)
	 */
	public Number getPointRange() {
		return pointRange;
	}

	/**
	 * The X axis range that each point is valid for. This determines the width
	 * of the column. On a categorized axis, the range will be 1 by default (one
	 * category unit). On linear and datetime axes, the range will be computed
	 * as the distance between the two closest data points.
	 */
	public void setPointRange(Number pointRange) {
		this.pointRange = pointRange;
	}

	/**
	 * @see #setPointStart(Number)
	 */
	public Number getPointStart() {
		return pointStart;
	}

	/**
	 * If no x values are given for the points in a series, pointStart defines
	 * on what value to start. For example, if a series contains one yearly
	 * value starting from 1945, set pointStart to 1945.
	 * <p>
	 * Defaults to: 0
	 */
	public void setPointStart(Number pointStart) {
		this.pointStart = pointStart;
	}

	/**
	 * @see #setPointWidth(Number)
	 */
	public Number getPointWidth() {
		return pointWidth;
	}

	/**
	 * A pixel value specifying a fixed width for each column or bar. When
	 * <code>null</code>, the width is calculated from the
	 * <code>pointPadding</code> and <code>groupPadding</code>.
	 */
	public void setPointWidth(Number pointWidth) {
		this.pointWidth = pointWidth;
	}

	/**
	 * @see #setSelected(Boolean)
	 */
	public Boolean getSelected() {
		return selected;
	}

	/**
	 * Whether to select the series initially. If <code>showCheckbox</code> is
	 * true, the checkbox next to the series name will be checked for a selected
	 * series.
	 * <p>
	 * Defaults to: false
	 */
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	/**
	 * @see #setStates(States)
	 */
	public States getStates() {
		return states;
	}

	/**
	 * A wrapper object for all the series options in specific states.
	 */
	public void setStates(States states) {
		this.states = states;
	}

	/**
	 * @see #setStemColor(Color)
	 */
	public Color getStemColor() {
		return stemColor;
	}

	/**
	 * The color of the stem, the vertical line extending from the box to the
	 * whiskers. If <code>null</code>, the series color is used.
	 * <p>
	 * Defaults to: null
	 */
	public void setStemColor(Color stemColor) {
		this.stemColor = stemColor;
	}

	/**
	 * @see #setStemDashStyle(String)
	 */
	public String getStemDashStyle() {
		return stemDashStyle;
	}

	/**
	 * The dash style of the stem, the vertical line extending from the box to
	 * the whiskers.
	 * <p>
	 * Defaults to: Solid
	 */
	public void setStemDashStyle(String stemDashStyle) {
		this.stemDashStyle = stemDashStyle;
	}

	/**
	 * @see #setStemWidth(Number)
	 */
	public Number getStemWidth() {
		return stemWidth;
	}

	/**
	 * The width of the stem, the vertical line extending from the box to the
	 * whiskers. If <code>null</code>, the width is inherited from the <a
	 * href="#plotOptions.boxplot.lineWidth">lineWidth</a> option.
	 * <p>
	 * Defaults to: null
	 */
	public void setStemWidth(Number stemWidth) {
		this.stemWidth = stemWidth;
	}

	/**
	 * @see #setStickyTracking(Boolean)
	 */
	public Boolean getStickyTracking() {
		return stickyTracking;
	}

	/**
	 * Sticky tracking of mouse events. When true, the <code>mouseOut</code>
	 * event on a series isn't triggered until the mouse moves over another
	 * series, or out of the plot area. When false, the <code>mouseOut</code>
	 * event on a series is triggered when the mouse leaves the area around the
	 * series' graph or markers. This also implies the tooltip. When
	 * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is
	 * false, the tooltip will be hidden when moving the mouse between series.
	 * Defaults to true for line and area type series, but to false for columns,
	 * pies etc.
	 * <p>
	 * Defaults to: true
	 */
	public void setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
	}

	/**
	 * @see #setTooltip(Tooltip)
	 */
	public Tooltip getTooltip() {
		return tooltip;
	}

	/**
	 * A configuration object for the tooltip rendering of each single series.
	 * Properties are inherited from <a href="#tooltip">tooltip</a>, but only
	 * the following properties can be defined on a series level.
	 */
	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}

	/**
	 * @see #setTurboThreshold(Number)
	 */
	public Number getTurboThreshold() {
		return turboThreshold;
	}

	/**
	 * When a series contains a data array that is longer than this, only one
	 * dimensional arrays of numbers, or two dimensional arrays with x and y
	 * values are allowed. Also, only the first point is tested, and the rest
	 * are assumed to be the same format. This saves expensive data checking and
	 * indexing in long series. Set it to <code>0</code> disable.
	 * <p>
	 * Defaults to: 1000
	 */
	public void setTurboThreshold(Number turboThreshold) {
		this.turboThreshold = turboThreshold;
	}

	/**
	 * @see #setVisible(Boolean)
	 */
	public Boolean getVisible() {
		return visible;
	}

	/**
	 * Set the initial visibility of the series.
	 * <p>
	 * Defaults to: true
	 */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	/**
	 * @see #setWhiskerColor(Color)
	 */
	public Color getWhiskerColor() {
		return whiskerColor;
	}

	/**
	 * The color of the whiskers, the horizontal lines marking low and high
	 * values. When <code>null</code>, the general series color is used.
	 * <p>
	 * Defaults to: null
	 */
	public void setWhiskerColor(Color whiskerColor) {
		this.whiskerColor = whiskerColor;
	}

	public float getWhiskerLength() {
		String tmp = whiskerLength;
		if (whiskerLength == null) {
			return -1.0f;
		}
		if (this.whiskerLength.contains("%")) {
			tmp = tmp.replace("%", "");
		}
		return Float.valueOf(tmp).floatValue();
	}

	public Unit getWhiskerLengthUnit() {
		if (this.whiskerLength == null) {
			return Unit.PIXELS;
		}
		if (this.whiskerLength.contains("%")) {
			return Unit.PERCENTAGE;
		}
		return Unit.PIXELS;
	}

	public void setWhiskerLength(String whiskerLength) {
		SizeWithUnit tmp = SizeWithUnit.parseStringSize(whiskerLength);
		if (tmp != null) {
			setWhiskerLength(tmp.getSize(), tmp.getUnit());
		} else {
			setWhiskerLength(-1, Unit.PIXELS);
		}
	}

	public void setWhiskerLength(float whiskerLength, Unit unit) {
		String value = Float.toString(whiskerLength);
		if (unit.equals(Unit.PERCENTAGE)) {
			value += "%";
		}
		if (whiskerLength == -1) {
			value = null;
		}
		this.whiskerLength = value;
	}

	/**
	 * @see #setWhiskerWidth(Number)
	 */
	public Number getWhiskerWidth() {
		return whiskerWidth;
	}

	/**
	 * The line width of the whiskers, the horizontal lines marking low and high
	 * values. When <code>null</code>, the general <a
	 * href="#plotOptions.errorbar.lineWidth">lineWidth</a> applies.
	 * <p>
	 * Defaults to: null
	 */
	public void setWhiskerWidth(Number whiskerWidth) {
		this.whiskerWidth = whiskerWidth;
	}

	/**
	 * @see #setZoneAxis(String)
	 */
	public String getZoneAxis() {
		return zoneAxis;
	}

	/**
	 * Defines the Axis on which the zones are applied.
	 * <p>
	 * Defaults to: y
	 */
	public void setZoneAxis(String zoneAxis) {
		this.zoneAxis = zoneAxis;
	}

	public Zones[] getZones() {
		Zones[] arr = new Zones[zones.size()];
		zones.toArray(arr);
		return arr;
	}

	public void setZones(Zones... zones) {
		this.zones = new ArrayList<Zones>(Arrays.asList(zones));
	}

	public void addZone(Zones zone) {
		if (this.zones == null) {
			this.zones = new ArrayList<Zones>();
		}
		this.zones.add(zone);
	}

	public void removeZone(Zones zone) {
		this.zones.remove(zone);
	}

	public void setPointStart(Date date) {
		this.pointStart = Util.toHighchartsTS(date);
	}
}