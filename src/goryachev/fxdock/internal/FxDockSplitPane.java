// Copyright (c) 2016 Andy Goryachev <andy@goryachev.com>
package goryachev.fxdock.internal;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.ReadOnlyProperty;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;


/**
 * FxDockSplitPane.
 */
public class FxDockSplitPane
	extends SplitPane
{
	protected final ReadOnlyObjectWrapper<Node> parent = new ReadOnlyObjectWrapper<Node>();

	
	public FxDockSplitPane()
	{
	}
	
	
	public final ReadOnlyProperty<Node> dockParentProperty()
	{
		return parent.getReadOnlyProperty();
	}
}
