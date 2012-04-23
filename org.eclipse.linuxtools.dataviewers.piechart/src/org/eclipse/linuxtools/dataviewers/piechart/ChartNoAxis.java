package org.eclipse.linuxtools.dataviewers.piechart;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.swtchart.Chart;


public class ChartNoAxis extends Chart{
	
	protected PlotAreaNoAxis plotArea;
	
	
    public ChartNoAxis(Composite parent, int style) {
		super(parent, style);
		
		
		plotArea = new PlotAreaNoAxis(this, SWT.NONE);
		
		
		
	}
	
	
	
	

}
