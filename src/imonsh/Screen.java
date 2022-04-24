package imonsh;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class Screen extends JFrame{
    private JTextPane textPane;
    private JScrollPane scrollPane;
    private DefaultStyledDocument styledDoc;
    private SimpleAttributeSet attr;

    public Screen() {
        this("Pantalla de salida");
    }

    public Screen(String tit) {
        super(tit);
        this.styledDoc = new DefaultStyledDocument();
        this.attr = new SimpleAttributeSet();
        this.setDefaultCloseOperation(3);
        this.setSize(600, 300);
        this.textPane = new JTextPane(this.styledDoc);
        this.scrollPane = new JScrollPane(this.textPane);
        this.getContentPane().add(this.scrollPane);
        this.setLocationRelativeTo((Component)null);
        StyleConstants.setForeground(this.attr, Color.BLUE);
        StyleConstants.setFontSize(this.attr, 20);
        StyleConstants.setFontFamily(this.attr, "Times New Roman");
    }

    public void out(String line) {
        try {
            this.styledDoc.insertString(this.styledDoc.getLength(), line, this.attr);
        } catch (BadLocationException var3) {
            System.err.println(var3);
        }

    }

    public void cls() {
        this.textPane.setText("");
    }

    public void changeStyle(String font, int size, Color c, Color f) {
        this.attr = new SimpleAttributeSet();
        StyleConstants.setForeground(this.attr, c);
        this.textPane.setBackground(f);
        StyleConstants.setFontSize(this.attr, size);
        StyleConstants.setFontFamily(this.attr, font);
    }

    public void changeStyle(String font, int size, Color c) {
        this.attr = new SimpleAttributeSet();
        StyleConstants.setForeground(this.attr, c);
        StyleConstants.setFontSize(this.attr, size);
        StyleConstants.setFontFamily(this.attr, font);
    }

    public void showImage(String f, int width, int height) {
        try {
            ImageIcon imageIcon = new ImageIcon(f);
            Image image = imageIcon.getImage();
            Image newimg = image.getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(newimg);  // transform it back

            StyleConstants.setIcon(this.attr, imageIcon);
            this.styledDoc.insertString(this.styledDoc.getLength(), " ", this.attr);
            this.attr = new SimpleAttributeSet();
            StyleConstants.setForeground(this.attr, Color.BLUE);
            StyleConstants.setFontSize(this.attr, 20);
            StyleConstants.setFontFamily(this.attr, "Times New Roman");
        } catch (BadLocationException var3) {
            System.err.println(var3);
        }

    }

    public void out(String line, String font, int size, Color c) {
        try {
            SimpleAttributeSet attr = new SimpleAttributeSet();
            StyleConstants.setForeground(attr, c);
            StyleConstants.setFontSize(attr, size);
            StyleConstants.setFontFamily(attr, font);
            this.styledDoc.insertString(this.styledDoc.getLength(), line, attr);
        } catch (BadLocationException var6) {
            System.err.println(var6);
        }

    }

    public void out(String line, Color c) {
        try {
            SimpleAttributeSet attr = new SimpleAttributeSet();
            StyleConstants.setForeground(attr, c);
            this.styledDoc.insertString(this.styledDoc.getLength(), line, attr);
        } catch (BadLocationException var4) {
            System.err.println(var4);
        }

    }
}