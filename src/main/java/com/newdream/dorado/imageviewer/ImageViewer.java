package com.newdream.dorado.imageviewer;

import com.bstek.dorado.annotation.ClientEvent;
import com.bstek.dorado.annotation.ClientEvents;
import com.bstek.dorado.annotation.ClientObject;
import com.bstek.dorado.annotation.XmlNode;
import com.bstek.dorado.common.ClientType;
import com.bstek.dorado.view.annotation.Widget;
import com.bstek.dorado.view.widget.Component;

/**
 * @author zhoushijin
 * @createdate 2017-8-17
 *
 */
@Widget(name = "ImageViewer", category = "profile", dependsPackage = "imageViewer", autoGenerateId = true)
@ClientObject(prototype="dorado.widget.imageViewer", shortTypeName="imageViewer")
@XmlNode(nodeName = "ImageViewer", clientTypes = ClientType.DESKTOP)
@ClientEvents({
	@ClientEvent(name="build"),
	@ClientEvent(name="built"),
	@ClientEvent(name="show"),
	@ClientEvent(name="shown"),
	@ClientEvent(name="hide"),
	@ClientEvent(name="hidden"),
	@ClientEvent(name="view"),
	@ClientEvent(name="viewed")
	})
public class ImageViewer extends Component{
	
	private String url;
	
	private boolean inline;
	
	private boolean toolbar;
	
	private boolean navbar;
	
	
	private boolean button;
	
	private boolean title;
	
	private boolean tooltip;
	
	private boolean movable;
	
	private boolean zoomable;
	
	private boolean rotatable;
	
	private boolean scalable;
	
	private boolean transition;
	
	private boolean fullscreen;
	
	private boolean keyboard;

	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isInline() {
		return inline;
	}

	public void setInline(boolean inline) {
		this.inline = inline;
	}
	
	public boolean isToolbar() {
		return toolbar;
	}
	
	public void setToolbar(boolean toolbar) {
		this.toolbar = toolbar;
	}
	
	public boolean isNavbar() {
		return navbar;
	}

	public void setNavbar(boolean navbar) {
		this.navbar = navbar;
	}

	public boolean isButton() {
		return button;
	}

	public void setButton(boolean button) {
		this.button = button;
	}

	public boolean isTitle() {
		return title;
	}

	public void setTitle(boolean title) {
		this.title = title;
	}

	public boolean isTooltip() {
		return tooltip;
	}

	public void setTooltip(boolean tooltip) {
		this.tooltip = tooltip;
	}

	public boolean isMovable() {
		return movable;
	}

	public void setMovable(boolean movable) {
		this.movable = movable;
	}

	public boolean isZoomable() {
		return zoomable;
	}

	public void setZoomable(boolean zoomable) {
		this.zoomable = zoomable;
	}

	public boolean isRotatable() {
		return rotatable;
	}

	public void setRotatable(boolean rotatable) {
		this.rotatable = rotatable;
	}

	public boolean isScalable() {
		return scalable;
	}

	public void setScalable(boolean scalable) {
		this.scalable = scalable;
	}

	public boolean isTransition() {
		return transition;
	}

	public void setTransition(boolean transition) {
		this.transition = transition;
	}

	public boolean isFullscreen() {
		return fullscreen;
	}

	public void setFullscreen(boolean fullscreen) {
		this.fullscreen = fullscreen;
	}

	public boolean isKeyboard() {
		return keyboard;
	}

	public void setKeyboard(boolean keyboard) {
		this.keyboard = keyboard;
	}
	
	
}
