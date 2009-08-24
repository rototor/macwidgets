package com.explodingpixels.macwidgets;

import com.explodingpixels.macwidgets.plaf.HudButtonUI;
import com.explodingpixels.macwidgets.plaf.HudCheckBoxUI;
import com.explodingpixels.macwidgets.plaf.HudComboBoxUI;
import com.explodingpixels.macwidgets.plaf.HudLabelUI;
import com.explodingpixels.macwidgets.plaf.HudRadioButtonUI;
import com.explodingpixels.macwidgets.plaf.HudSliderUI;
import com.explodingpixels.macwidgets.plaf.HudTextFieldUI;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 * A factory for creating HUD style widgets. These widgets should be added to a
 * {@link com.explodingpixels.macwidgets.HudWindow}.
 */
public class HudWidgetFactory {

    private HudWidgetFactory() {
        // utility class - no constructor needed.
    }

    /**
     * Creates a Heads Up Display (HUD) style label, similar to that seen in various iApps (e.g.
     * iPhoto).
     * <br/><br/>
     * <img src="../../../../graphics/HUDLabelUI.png">
     *
     * @param labelText the text of the label.
     * @return the HUD style label.
     * @see HudLabelUI
     */
    public static JLabel createHudLabel(String labelText) {
        JLabel label = new JLabel(labelText);
        label.setUI(new HudLabelUI());
        return label;
    }

    /**
     * Creates a Heads Up Display (HUD) style button, similar to that seen in various iApps (e.g.
     * iPhoto).
     * <br/><br/>
     * <img src="../../../../graphics/HUDButtonUI.png">
     *
     * @param buttonText the text of the button.
     * @return the HUD style button.
     * @see HudButtonUI
     */
    public static JButton createHudButton(String buttonText) {
        JButton button = new JButton(buttonText);
        button.setUI(new HudButtonUI());
        return button;
    }

    /**
     * Creates a Heads Up Display (HUD) style check box, similar to that seen in various iApps (e.g.
     * iPhoto).
     * <br/><br/>
     * <img src="../../../../graphics/HUDCheckBoxUI.png">
     *
     * @param checkBoxText the text of the check box.
     * @return the HUD style check box.
     * @see HudCheckBoxUI
     */
    public static JCheckBox createHudCheckBox(String checkBoxText) {
        JCheckBox checkBox = new JCheckBox(checkBoxText);
        checkBox.setUI(new HudCheckBoxUI());
        return checkBox;
    }

    /**
     * Creates a Heads Up Display (HUD) style combo box, similar to that seen in various iApps (e.g.
     * iPhoto).
     * <br/><br/>
     * <img src="../../../../graphics/HUDComboBoxUI.png">
     *
     * @param model the model containing the combo box items.
     * @return the HUD style combo box.
     * @see HudComboBoxUI
     */
    public static JComboBox createHudComboBox(ComboBoxModel model) {
        JComboBox comboBox = new JComboBox(model);
        comboBox.setUI(new HudComboBoxUI());
        return comboBox;
    }

    /**
     * Creates a Heads Up Display (HUD) style text field, similar to that seen in various iApps
     * (e.g. iPhoto).
     * <br/><br/>
     * <img src="../../../../graphics/HUDTextFieldUI.png">
     *
     * @param text the initial text in the text field.
     * @return the HUD style text field.
     * @see HudTextFieldUI
     */
    public static JTextField createHudTextField(String text) {
        JTextField textField = new JTextField(text);
        textField.setUI(new HudTextFieldUI());
        return textField;
    }

    /**
     * Creates a Heads Up Display (HUD) style radio button, similar to that seen in various iApps
     * (e.g. iPhoto).
     * <br/><br/>
     * <img src="../../../../graphics/HUDRadioButtonUI.png">
     *
     * @param text the text of the radio button.
     * @return the HUD style radio button.
     * @see HudRadioButtonUI
     */
    public static JRadioButton createHudRadioButton(String text) {
        JRadioButton radioButton = new JRadioButton(text);
        radioButton.setUI(new HudRadioButtonUI());
        return radioButton;
    }

    public static JSlider createHudSlider() {
        JSlider slider = new JSlider();
        slider.setUI(new HudSliderUI(slider));
        return slider;
    }
}
