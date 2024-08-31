package com.vaadin.starter.skeleton;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ButtonView extends VerticalLayout {

	public ButtonView() {
		Button button = new Button("Press!", e -> {
			add(new Paragraph("Button clicked"));
		});
		button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
		button.addClickShortcut(Key.ENTER);
		addClassName("centered-content");
		add(button);
	}
}
