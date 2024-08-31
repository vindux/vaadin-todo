package com.vaadin.starter.skeleton;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("test")
public class TestView extends VerticalLayout {

	public TestView() {
		add(new Paragraph("This is a test view!!!"));
		add(new ButtonView());
		addClassName("centered-content");

	}

}
