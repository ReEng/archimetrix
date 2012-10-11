/*
 * The FUJABA ToolSuite for Eclipse project:
 *
 *   FUJABA is the acronym for 'From Uml to Java And Back Again'
 *   and originally aims to provide an environment for round-trip
 *   engineering using UML as visual programming language. During
 *   the last years, the environment has become a base for several
 *   research activities, e.g. distributed software, database
 *   systems, modelling mechanical and electrical systems and
 *   their simulation. Thus, the environment has become a project,
 *   where this source code is part of. Further details are avail-
 *   able via http://www.fujaba.de
 *
 *      Copyright (C) Fujaba Development Group
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free
 *   Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 *   MA 02111-1307, USA or download the license under
 *   http://www.gnu.org/copyleft/lesser.html
 *
 * WARRANTY:
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 * Contact address:
 *
 *   Fujaba Management Board
 *   Software Engineering Group
 *   University of Paderborn
 *   Warburgerstr. 100
 *   D-33098 Paderborn
 *   Germany
 *
 *   URL  : http://www.fujaba.de
 *   email: info@fujaba.de
 *
 */
package org.fujaba.commons;


import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;


/**
 * @author $Author: lowende $
 * @version $Revision: 1263 $ $Date: 2007-01-23 13:23:19 +0100 (Di, 23 Jan 2007) $
 */
public abstract class Commons4EclipseFonts
{

   private final static String PREFIX = FujabaCommonsPlugin.ID + ".FONT_";

   public final static String FONT_DEFAULT_NORMAL = JFaceResources.DEFAULT_FONT;

   public final static String FONT_DEFAULT_ITALIC = PREFIX + "ITALIC";

   public final static String FONT_DEFAULT_BOLD = PREFIX + "BOLD";

   public final static String FONT_DEFAULT_BOLD_ITALIC = PREFIX + "BOLD_ITALIC";


   static
   {
      // doing this in Plugin.start() causes NPE if run as RCP, so do it here
      initializeFontRegistry();
   }


   static void initializeFontRegistry()
   {
      FontData[] fontData;

      fontData = getModifiedFontData(getFontData(FONT_DEFAULT_NORMAL),
            SWT.ITALIC);
      JFaceResources.getFontRegistry().put(FONT_DEFAULT_ITALIC, fontData);

      fontData = getModifiedFontData(getFontData(FONT_DEFAULT_NORMAL), SWT.BOLD);
      JFaceResources.getFontRegistry().put(FONT_DEFAULT_BOLD, fontData);

      fontData = getModifiedFontData(getFontData(FONT_DEFAULT_BOLD), SWT.ITALIC);
      JFaceResources.getFontRegistry().put(FONT_DEFAULT_BOLD_ITALIC, fontData);
   }


   public static FontData[] getFontData(String symbolicName)
   {
      return JFaceResources.getFontRegistry().getFontData(symbolicName);
   }


   public static Font getFont(String symbolicName)
   {
      return JFaceResources.getFontRegistry().get(symbolicName);
   }


   private static FontData[] getModifiedFontData(FontData[] baseData, int style)
   {
      FontData[] styleData = new FontData[baseData.length];
      for (int i = 0; i < styleData.length; i++)
      {
         FontData base = baseData[i];
         styleData[i] = new FontData(base.getName(), base.getHeight(), base
               .getStyle()
               | style);
      }

      return styleData;
   }

}
