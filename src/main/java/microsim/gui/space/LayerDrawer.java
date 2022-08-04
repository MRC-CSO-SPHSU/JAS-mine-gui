package microsim.gui.space;

import java.awt.Graphics;

/**
 * An interface used by LayeredSurfaceFrame to delegate
 * the rendering of a layer.
 *
 * <p>Title: JAS</p>
 * <p>Description: Java Agent-based Simulation library</p>
 * <p>Copyright (C) 2002 Michele Sonnessa</p>
 *
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 *
 * @author Michele Sonnessa
 * <p>
 */
public interface ILayerDrawer extends ILayerMouseListener
{
  /** Return the description of the layer.
   *  @return The string describing the layer.*/
  public String getDescription();

  /** Return if the layer is currently displayed.
   *  @return True if the layer is displayed.*/
  public boolean isDisplayed();
  /** Set the display status.
   *  @param display If true the layer will be displayed.*/
  public void setDisplay(boolean display);

  /** Paint the layer on the screen.
   *  @param g The current graphics device.
   *  @param cellLen The length of a cell in pixels.*/
  public void paint(Graphics g, int cellLen);

}