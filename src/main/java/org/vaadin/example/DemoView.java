package org.vaadin.example;

import javax.annotation.PostConstruct;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.mpr.core.HasLegacyComponents;

@Route(value = "", layout = V14Layout.class)
public class DemoView extends VerticalLayout implements HasLegacyComponents {
	
	@PostConstruct
	private void init() {
		com.vaadin.ui.Button v7Button = new com.vaadin.ui.Button("Legacy Button");
		add(new Button("SAVE", VaadinIcon.VAADIN_H.create()));
		add(getLegacyWrapper(v7Button));
		setSizeFull();
	}
}
