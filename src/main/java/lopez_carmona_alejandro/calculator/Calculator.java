package lopez_carmona_alejandro.calculator;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.awt.Color;
import javax.swing.*;
import java.lang.Math;

/**
 *
 * @author alope
 */
public final class Calculator {

    private static final int WINDOW_WIDTH = 410;
    private static final int WINDOW_HEIGHT = 600;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 70;
    private static final int MARGIN_X = 20;
    private static final int MARGIN_Y = 60;

    private JFrame ventana; // Main ventana
    private JComboBox<String> comboCalcType, comboTheme;
    private JTextField inText; // Input
    private JButton btnC, btnBack, btnMod, btnDiv, btnMul, btnSub, btnAdd,
            btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnPoint, btnEqual, btnRoot, btnPower, btnLog;

    private char opt = ' '; // Save the operator
    private boolean go = true; // For calculate with Opt != (=)
    private boolean addWrite = true; // Connect numbers in display
    private double val = 0; // Save the value typed for calculation
    private float cantidad;
    
    /**
     *
     * @return the WINDOW_WIDTH value
     */
    public static int getWindowWidth() {
        return WINDOW_WIDTH;
    }
    
    /**
     *
     * @return the WINDOW_HEIGHT value
     */
    public static int getWindowHeight() {
        return WINDOW_HEIGHT;
    }

    /**
     *
     * @return the BUTTON_WIDTH value
     */
    public static int getButtonWidth() {
        return BUTTON_WIDTH;
    }

    /**
     *
     * @return WINDOW_HEIGHT value
     */
    public static int getButtonHeight() {
        return BUTTON_HEIGHT;
    }
  
    /**
     *
     * @return the MARGIN_X value
     */
    public static int getMarginX() {
        return MARGIN_X;
    }

    /**
     *
     * @return the MARGIN_Y value
     */
    public static int getMarginY() {
        return MARGIN_Y;
    }
    
    /**
     *
     * @return the ventana value
     */
    public JFrame getVentana() {
        return ventana;
    }
    
    /**
     *
     * @param ventana set the value from the constructor
     */
    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }
    
    /**
     *
     * @return the comboCalcType value
     */
    public JComboBox<String> getComboCalcType() {
        return comboCalcType;
    }
    
    /**
     *
     * @param comboCalcType set the value from the constructor
     */
    public void setComboCalcType(JComboBox<String> comboCalcType) {
        this.comboCalcType = comboCalcType;
    }

    /**
     *
     * @return the comboTheme value
     */
    public JComboBox<String> getComboTheme() {
        return comboTheme;
    }
    
    /**
     *
     * @param comboTheme set the value from the constructor
     */
    public void setComboTheme(JComboBox<String> comboTheme) {
        this.comboTheme = comboTheme;
    }
 
    /**
     *
     * @return the inText value
     */
    public JTextField getInText() {
        return inText;
    }
    
    /**
     *
     * @param inText set the value from the constructor
     */
    public void setInText(JTextField inText) {
        this.inText = inText;
    }

    /**
     *
     * @return the btnC value
     */
    public JButton getBtnC() {
        return btnC;
    }
    
    /**
     *
     * @param btnC set the value from the constructor
     */
    public void setBtnC(JButton btnC) {
        this.btnC = btnC;
    }  
    
    /**
     *
     * @return the btnBack value
     */
    public JButton getBtnBack() {
        return btnBack;
    }
    
    /**
     *
     * @param btnBack set the value from the constructor
     */
    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }  
    
    /**
     *
     * @return the btnMod value
     */
    public JButton getBtnMod() {
        return btnMod;
    }
    
    /**
     *
     * @param btnMod set the value from the constructor
     */
    public void setBtnMod(JButton btnMod) {
        this.btnMod = btnMod;
    }  
    
    /**
     *
     * @return the btnDiv value
     */
    public JButton getBtnDiv() {
        return btnDiv;
    }
    
    /**
     *
     * @param btnDiv set the value from the constructor
     */
    public void setBtnDiv(JButton btnDiv) {
        this.btnDiv = btnDiv;
    } 
    
    /**
     *
     * @return the btnMul value
     */
    public JButton getBtnMul() {
        return btnMul;
    }
    
    /**
     *
     * @param btnMul set the value from the constructor
     */
    public void setBtnMul(JButton btnMul) {
        this.btnMul = btnMul;
    }  
    
    /**
     *
     * @return the btnSub value
     */
    public JButton getBtnSub() {
        return btnSub;
    }
    
    /**
     *
     * @param btnSub set the value from the constructor
     */
    public void setBtnSub(JButton btnSub) {
        this.btnSub = btnSub;
    }  
    
    /**
     *
     * @return the btnAdd value
     */
    public JButton getBtnAdd() {
        return btnAdd;
    }
    
    /**
     *
     * @param btnAdd set the value from the constructor
     */
    public void setBtnAdd(JButton btnAdd) {
        this.btnAdd = btnAdd;
    }  
    
    /**
     *
     * @return the btn0 value
     */
    public JButton getBtn0() {
        return btn0;
    }
    
    /**
     *
     * @param btn0 set the value from the constructor
     */
    public void setBtn0(JButton btn0) {
        this.btn0 = btn0;
    } 
    
    /**
     *
     * @return the btn1 value
     */
    public JButton getBtn1() {
        return btn1;
    }
    
    /**
     *
     * @param btn1 set the value from the constructor
     */
    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }  
    
    /**
     *
     * @return the btn2 value
     */
    public JButton getBtn2() {
        return btn2;
    }
    
    /**
     *
     * @param btn2 set the value from the constructor
     */
    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }  
    
    /**
     *
     * @return the btn3 value
     */
    public JButton getBtn3() {
        return btn3;
    }
    
    /**
     *
     * @param btn3 set the value from the constructor
     */
    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }  
    
    /**
     *
     * @return the btn4 value
     */
    public JButton getBtn4() {
        return btn4;
    }
    
    /**
     *
     * @param btn4 set the value from the constructor
     */
    public void setBtn4(JButton btn4) {
        this.btn4 = btn4;
    } 
    
    /**
     *
     * @return the btn5 value
     */
    public JButton getBtn5() {
        return btn5;
    }
    
    /**
     *
     * @param btn5 set the value from the constructor
     */
    public void setBtn5(JButton btn5) {
        this.btn5 = btn5;
    }  
    
    /**
     *
     * @return the btn6 value
     */
    public JButton getBtn6() {
        return btn6;
    }
    
    /**
     *
     * @param btn6 set the value from the constructor
     */
    public void setBtn6(JButton btn6) {
        this.btn6 = btn6;
    }  
    
    /**
     *
     * @return the btn7 value
     */
    public JButton getBtn7() {
        return btn7;
    }
    
    /**
     *
     * @param btn7 set the value from the constructor
     */
    public void setBtn7(JButton btn7) {
        this.btn7 = btn7;
    }  
    
    /**
     *
     * @return the btn8 value
     */
    public JButton getBtn8() {
        return btn8;
    }
    
    /**
     *
     * @param btn8 set the value from the constructor
     */
    public void setBtn8(JButton btn8) {
        this.btn8 = btn8;
    } 
    
    /**
     *
     * @return the btn9 value
     */
    public JButton getBtn9() {
        return btn9;
    }
    
    /**
     *
     * @param btn9 set the value from the constructor
     */
    public void setBtn9(JButton btn9) {
        this.btn9 = btn9;
    }  
    
    /**
     *
     * @return the btnPoint value
     */
    public JButton getBtnPoint() {
        return btnPoint;
    }
    
    /**
     *
     * @param btnPoint set the value from the constructor
     */
    public void setBtnPoint(JButton btnPoint) {
        this.btnPoint = btnPoint;
    } 
    
    /**
     *
     * @return the btnEqual value
     */
    public JButton getBtnEqual() {
        return btnEqual;
    }
    
    /**
     *
     * @param btnEqual set the value from the constructor
     */
    public void setBtnEqual(JButton btnEqual) {
        this.btnEqual = btnEqual;
    } 

    /**
     *
     * @return the btnRoot value
     */
    public JButton getBtnRoot() {
        return btnRoot;
    }
    
    /**
     *
     * @param btnRoot set the value from the constructor
     */
    public void setBtnRoot(JButton btnRoot) {
        this.btnRoot = btnRoot;
    } 

    /**
     *
     * @return the btnPower value
     */
    public JButton getBtnPower() {
        return btnPower;
    }
    
    /**
     *
     * @param btnPower set the value from the constructor
     */
    public void setBtnPower(JButton btnPower) {
        this.btnPower = btnPower;
    } 

    /**
     *
     * @return the btnLog value
     */
    public JButton getBtnLog() {
        return btnLog;
    }
    
    /**
     *
     * @param btnLog set the value from the constructor
     */
    public void setBtnLog(JButton btnLog) {
        this.btnLog = btnLog;
    } 

    /**
     *
     * @return the opt value
     */
    public char getOpt() {
        return opt;
    }
    
    /**
     *
     * @param opt set the value from the constructor
     */
    public void setOpt(char opt) {
        this.opt = opt;
    } 

    /**
     *
     * @return the go value
     */
    public boolean isGo() {
        return go;
    }
    
    /**
     *
     * @param go set the value from the constructor
     */
    public void setGo(boolean go) {
        this.go = go;
    }   

    /**
     *
     * @return the addWrite value
     */
    public boolean isAddWrite() {
        return addWrite;
    }

    /**
     *
     * @param addWrite set the value from the constructor
     */
    public void setAddWrite(boolean addWrite) {
        this.addWrite = addWrite;
    }

    /**
     *
     * @return the val value
     */
    public double getVal() {
        return val;
    }

    /**
     *
     * @param val set the value from the constructor 
     */
    public void setVal(double val) {
        this.val = val;
    }
    
    /**
     *
     * @return the cantidad value
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param cantidad set the value from the constructor
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    private void operativa_ventana() {
        setVentana(new JFrame("Calculator"));
        getVentana().setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        getVentana().setLocationRelativeTo(null); // Move ventana to center        
    }

    /*
        Mx Calculator: 
        X = Row
        Y = Column
    
        +-------------------+
        |   +-----------+   |   y[0]
        |   |           |   |
        |   +-----------+   |
        |                   |
        |   C  <-   %   /   |   y[1]
        |   7   8   9   *   |   y[2]
        |   4   5   6   -   |   y[3]
        |   1   2   3   +   |   y[4]
        |   .   0     =     |   y[5]
        +-------------------+
         x[0] x[1] x[2] x[3]
    
    */
    
    /*    
        +-------------------+
        |   +-----------+   |   y[0]
        |   |           |   |
        |   +-----------+   |
        |                   |
        |   0   1   1   3   |   y[1]
        |   4   5   6   7   |   y[2]
        |   8   9   10  11  |   y[3]
        |   12  13  14  15  |   y[4]
        |   16  17    18    |   y[5]
        +-------------------+
         x[0] x[1] x[2] x[3]
    
    */

    /**
     * Main constructor of the class
     */


    public Calculator() {
        operativa_ventana();

        setComboTheme(initCombo(new String[]{"Simple", "Colored"}, 230, 30, "Theme", themeSwitchEventConsumer));

        setComboCalcType(initCombo(new String[]{"Standard", "Scientific"}, 20, 30, "Calculator type", calcTypeSwitchEventConsumer));

        int[] x = {MARGIN_X, MARGIN_X + 90, 200, 290, 380};
        int[] y = {MARGIN_Y, MARGIN_Y + 100, MARGIN_Y + 180, MARGIN_Y + 260, MARGIN_Y + 340, MARGIN_Y + 420};

        setInText(new JTextField("0"));
        getInText().setBounds(x[0], y[0], 350, 70);
        getInText().setEditable(false);
        getInText().setBackground(Color.WHITE);
        getInText().setFont(new Font("Comic Sans MS", Font.PLAIN, 33));
        getVentana().add(getInText());

        setBtnC(initBtn("C", x[0], y[1], event -> {
            repaintFont();
            getInText().setText("0");
            setOpt(' ');
            setVal(0);
        }));

        setBtnBack(initBtn("<-", x[1], y[1], event -> {
            repaintFont();
            String str = getInText().getText();
            StringBuilder str2 = new StringBuilder();
            for (int i = 0; i < (str.length() - 1); i++) {
                str2.append(str.charAt(i));
            }
            if (str2.toString().equals("")) {
                getInText().setText("0");
            } else {
                getInText().setText(str2.toString());
            }
        }));

        setBtnMod(initBtn("%", x[2], y[1], event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", getInText().getText()))
                if (isGo()) {
                    setVal(calc(getVal(), getInText().getText(), getOpt(), getCantidad()));
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(getVal()))) {
                        getInText().setText(String.valueOf((int) getVal()));
                    } else {
                        getInText().setText(String.valueOf(getVal()));
                    }
                    setOpt('%');
                    setGo(false);
                    setAddWrite(false);
                }
        }));

        setBtnDiv(initBtn("/", x[3], y[1], event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", getInText().getText()))
                if (isGo()) {
                    setVal(calc(getVal(), getInText().getText(), getOpt(), getCantidad()));
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(getVal()))) {
                        getInText().setText(String.valueOf((int) getVal()));
                    } else {
                        getInText().setText(String.valueOf(getVal()));
                    }
                    setOpt('/');
                    setGo(false);
                    setAddWrite(false);
                } else {
                    setOpt('/');
                }
        }));

        setBtn7(initBtn("7", x[0], y[2], event -> {
            repaintFont();
            if (isAddWrite()) {
                if (Pattern.matches("[0]*", getInText().getText())) {
                    getInText().setText("7");
                } else {
                    getInText().setText(getInText().getText() + "7");
                }
            } else {
                getInText().setText("7");
                setAddWrite(true);
            }
            setGo(true);
        }));

        setBtn8(initBtn("8", x[1], y[2], event -> {
            repaintFont();
            if (isAddWrite()) {
                if (Pattern.matches("[0]*", getInText().getText())) {
                    getInText().setText("8");
                } else {
                    getInText().setText(getInText().getText() + "8");
                }
            } else {
                getInText().setText("8");
                setAddWrite(true);
            }
            setGo(true);
        }));

        setBtn9(initBtn("9", x[2], y[2], event -> {
            repaintFont();
            if (isAddWrite()) {
                if (Pattern.matches("[0]*", getInText().getText())) {
                    getInText().setText("9");
                } else {
                    getInText().setText(getInText().getText() + "9");
                }
            } else {
                getInText().setText("9");
                setAddWrite(true);
            }
            setGo(true);
        }));

        setBtnMul(initBtn("*", x[3], y[2], event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", getInText().getText()))
                if (isGo()) {
                    setVal(calc(getVal(), getInText().getText(), getOpt(), getCantidad()));
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(getVal()))) {
                        getInText().setText(String.valueOf((int) getVal()));
                    } else {
                        getInText().setText(String.valueOf(getVal()));
                    }
                    setOpt('*');
                    setGo(false);
                    setAddWrite(false);
                } else {
                    setOpt('*');
                }
        }));

        setBtn4(initBtn("4", x[0], y[3], event -> {
            repaintFont();
            if (isAddWrite()) {
                if (Pattern.matches("[0]*", getInText().getText())) {
                    getInText().setText("4");
                } else {
                    getInText().setText(getInText().getText() + "4");
                }
            } else {
                getInText().setText("4");
                setAddWrite(true);
            }
            setGo(true);
        }));

        setBtn5(initBtn("5", x[1], y[3], event -> {
            repaintFont();
            if (isAddWrite()) {
                if (Pattern.matches("[0]*", getInText().getText())) {
                    getInText().setText("5");
                } else {
                    getInText().setText(getInText().getText() + "5");
                }
            } else {
                getInText().setText("5");
                setAddWrite(true);
            }
            setGo(true);
        }));

        setBtn6(initBtn("6", x[2], y[3], event -> {
            repaintFont();
            if (isAddWrite()) {
                if (Pattern.matches("[0]*", getInText().getText())) {
                    getInText().setText("6");
                } else {
                    getInText().setText(getInText().getText() + "6");
                }
            } else {
                getInText().setText("6");
                setAddWrite(true);
            }
            setGo(true);
        }));

        setBtnSub(initBtn("-", x[3], y[3], event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", getInText().getText()))
                if (isGo()) {
                    setVal(calc(getVal(), getInText().getText(), getOpt(), getCantidad()));
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(getVal()))) {
                        getInText().setText(String.valueOf((int) getVal()));
                    } else {
                        getInText().setText(String.valueOf(getVal()));
                    }

                    setOpt('-');
                    setGo(false);
                    setAddWrite(false);
                } else {
                    setOpt('-');
                }
        }));

        setBtn1(initBtn("1", x[0], y[4], event -> {
            repaintFont();
            if (isAddWrite()) {
                if (Pattern.matches("[0]*", getInText().getText())) {
                    getInText().setText("1");
                } else {
                    getInText().setText(getInText().getText() + "1");
                }
            } else {
                getInText().setText("1");
                setAddWrite(true);
            }
            setGo(true);
        }));

        setBtn2(initBtn("2", x[1], y[4], event -> {
            repaintFont();
            if (isAddWrite()) {
                if (Pattern.matches("[0]*", getInText().getText())) {
                    getInText().setText("2");
                } else {
                    getInText().setText(getInText().getText() + "2");
                }
            } else {
                getInText().setText("2");
                setAddWrite(true);
            }
            setGo(true);
        }));

        setBtn3(initBtn("3", x[2], y[4], event -> {
            repaintFont();
            if (isAddWrite()) {
                if (Pattern.matches("[0]*", getInText().getText())) {
                    getInText().setText("3");
                } else {
                    getInText().setText(getInText().getText() + "3");
                }
            } else {
                getInText().setText("3");
                setAddWrite(true);
            }
            setGo(true);
        }));

        setBtnAdd(initBtn("+", x[3], y[4], event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", getInText().getText()))
                if (isGo()) {
                    setVal(calc(getVal(), getInText().getText(), getOpt(), getCantidad()));
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(getVal()))) {
                        getInText().setText(String.valueOf((int) getVal()));
                    } else {
                        getInText().setText(String.valueOf(getVal()));
                    }
                    setOpt('+');
                    setGo(false);
                    setAddWrite(false);
                } else {
                    setOpt('+');
                }
        }));

        setBtnPoint(initBtn(".", x[0], y[5], event -> {
            repaintFont();
            if (isAddWrite()) {
                if (!getInText().getText().contains(".")) {
                    getInText().setText(getInText().getText() + ".");
                }
            } else {
                getInText().setText("0.");
                setAddWrite(true);
            }
            setGo(true);
        }));

        setBtn0(initBtn("0", x[1], y[5], event -> {
            repaintFont();
            if (isAddWrite()) {
                if (Pattern.matches("[0]*", getInText().getText())) {
                    getInText().setText("0");
                } else {
                    getInText().setText(getInText().getText() + "0");
                }
            } else {
                getInText().setText("0");
                setAddWrite(true);
            }
            setGo(true);
        }));

        setBtnEqual(initBtn("=", x[2], y[5], event -> {
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", getInText().getText()))
                if (isGo()) {
                    setVal(calc(getVal(), getInText().getText(), getOpt(), cantidad));
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(getVal()))) {
                        getInText().setText(String.valueOf((int) getVal()));
                    } else {
                        getInText().setText(String.valueOf(getVal()));
                    }
                    setOpt('=');
                    setAddWrite(false);
                }
        }));
        getBtnEqual().setSize(2 * getButtonWidth() + 10, getButtonHeight());

        setBtnRoot(initBtn("√", x[4], y[1], event -> {
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", getInText().getText()))
                if (isGo()) {
                    setVal(Math.sqrt(Double.parseDouble(getInText().getText())));
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(getVal()))) {
                        getInText().setText(String.valueOf((int) getVal()));
                    } else {
                        getInText().setText(String.valueOf(getVal()));
                    }
                    setOpt('\u221A');
                    setAddWrite(false);
                }
        }));
        getBtnRoot().setVisible(false);

        setBtnPower(initBtn("pow", x[4], y[2], event -> {
            repaintFont();
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", getInText().getText()))
                if (isGo()) {
                    setVal(calc(getVal(), getInText().getText(), getOpt(), getCantidad()));
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(getVal()))) {
                        getInText().setText(String.valueOf((int) getVal()));
                    } else {
                        getInText().setText(String.valueOf(getVal()));
                    }
                    setOpt('^');
                    setGo(false);
                    setAddWrite(false);
                } else {
                    setOpt('^');
                }
        }));
        getBtnPower().setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        getBtnPower().setVisible(false);

        setBtnLog(initBtn("ln", x[4], y[3], event -> {
            if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", getInText().getText()))
                if (isGo()) {
                    setVal(Math.log(Double.parseDouble(getInText().getText())));
                    if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(getVal()))) {
                        getInText().setText(String.valueOf((int) getVal()));
                    } else {
                        getInText().setText(String.valueOf(getVal()));
                    }
                    setOpt('l');
                    setAddWrite(false);
                }
        }));
        getBtnLog().setVisible(false);

        getVentana().setLayout(null);
        getVentana().setResizable(false);
        getVentana().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close button clicked? = End The process
        getVentana().setVisible(true);
    }

    private JComboBox<String> initCombo(String[] items, int x, int y, String toolTip, Consumer consumerEvent) {
        JComboBox<String> combo = new JComboBox<>(items);
        combo.setBounds(x, y, 140, 25);
        combo.setToolTipText(toolTip);
        combo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        combo.addItemListener(consumerEvent::accept);
        getVentana().add(combo);

        return combo;
    }

    private JButton initBtn(String label, int x, int y, ActionListener event) {
        JButton btn = new JButton(label);
        btn.setBounds(x, y, getButtonWidth(), getButtonHeight());
        btn.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.addActionListener(event);
        getVentana().add(btn);

        return btn;
    }

    /**
     *
     * @param x
     * @param input
     * @param opt
     * @param cantidad
     * @return the operation result
     */
    public double calc(double x, String input, char opt, float cantidad) {
        getInText().setFont(getInText().getFont().deriveFont(Font.PLAIN));
        double y = Double.parseDouble(input);
        switch (getOpt()) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            case '%':
                return x % y;
            case '^':
                return Math.pow(x, y);
            default:
                getInText().setFont(getInText().getFont().deriveFont(Font.PLAIN));
                return y;
        }
    }

    private void repaintFont() {
        getInText().setFont(getInText().getFont().deriveFont(Font.PLAIN));
    }

    private Consumer<ItemEvent> calcTypeSwitchEventConsumer = event -> {
        if (event.getStateChange() != ItemEvent.SELECTED) return;

        String selectedItem = (String) event.getItem();
        switch (selectedItem) {
            case "Standard":
                getVentana().setSize(getWindowWidth(), getWindowHeight());
                getBtnRoot().setVisible(false);
                getBtnPower().setVisible(false);
                getBtnLog().setVisible(false);
                break;
            case "Scientific":
                getVentana().setSize(getWindowWidth() + 80, getWindowHeight());
                getBtnRoot().setVisible(true);
                getBtnPower().setVisible(true);
                getBtnLog().setVisible(true);
                break;
        }
    };

    private Consumer<ItemEvent> themeSwitchEventConsumer = event -> {
        if (event.getStateChange() != ItemEvent.SELECTED) return;

        String selectedTheme = (String) event.getItem();
        switch (selectedTheme) {
            case "Simple":
                getBtnC().setBackground(null);
                getBtnBack().setBackground(null);
                getBtnMod().setBackground(null);
                getBtnDiv().setBackground(null);
                getBtnMul().setBackground(null);
                getBtnSub().setBackground(null);
                getBtnAdd().setBackground(null);
                getBtnRoot().setBackground(null);
                getBtnLog().setBackground(null);
                getBtnPower().setBackground(null);
                getBtnEqual().setBackground(null);
                getBtn0().setBackground(null);
                getBtn1().setBackground(null);
                getBtn2().setBackground(null);
                getBtn3().setBackground(null);
                getBtn4().setBackground(null);
                getBtn5().setBackground(null);
                getBtn6().setBackground(null);
                getBtn7().setBackground(null);
                getBtn8().setBackground(null);
                getBtn9().setBackground(null);
                getBtnPoint().setBackground(null);

                getBtnC().setForeground(Color.BLACK);
                getBtnBack().setForeground(Color.BLACK);
                getBtnMod().setForeground(Color.BLACK);
                getBtnDiv().setForeground(Color.BLACK);
                getBtnMul().setForeground(Color.BLACK);
                getBtnSub().setForeground(Color.BLACK);
                getBtnAdd().setForeground(Color.BLACK);
                getBtnEqual().setForeground(Color.BLACK);
                getBtnLog().setForeground(Color.BLACK);
                getBtnPower().setForeground(Color.BLACK);
                getBtnRoot().setForeground(Color.BLACK);
                break;
            case "Colored":
                getBtnC().setBackground(Color.RED);
                getBtnBack().setBackground(Color.ORANGE);
                getBtnMod().setBackground(Color.GREEN);
                getBtnDiv().setBackground(Color.PINK);
                getBtnMul().setBackground(Color.PINK);
                getBtnSub().setBackground(Color.PINK);
                getBtnAdd().setBackground(Color.PINK);
                getBtnRoot().setBackground(Color.PINK);
                getBtnLog().setBackground(Color.PINK);
                getBtnPower().setBackground(Color.PINK);
                getBtnEqual().setBackground(Color.BLUE);
                getBtn0().setBackground(Color.WHITE);
                getBtn1().setBackground(Color.WHITE);
                getBtn2().setBackground(Color.WHITE);
                getBtn3().setBackground(Color.WHITE);
                getBtn4().setBackground(Color.WHITE);
                getBtn5().setBackground(Color.WHITE);
                getBtn6().setBackground(Color.WHITE);
                getBtn7().setBackground(Color.WHITE);
                getBtn8().setBackground(Color.WHITE);
                getBtn9().setBackground(Color.WHITE);
                getBtnPoint().setBackground(Color.WHITE);

                getBtnC().setForeground(Color.WHITE);
                getBtnBack().setForeground(Color.WHITE);
                getBtnMod().setForeground(Color.WHITE);
                getBtnDiv().setForeground(Color.WHITE);
                getBtnMul().setForeground(Color.WHITE);
                getBtnSub().setForeground(Color.WHITE);
                getBtnAdd().setForeground(Color.WHITE);
                getBtnEqual().setForeground(Color.WHITE);
                getBtnLog().setForeground(Color.WHITE);
                getBtnPower().setForeground(Color.WHITE);
                getBtnRoot().setForeground(Color.WHITE);
                break;
        }
    };

    /**
     *
     * @param args create new instance of the Calculator class
     */
    public static void main(String[] args) {
        new Calculator();
    }
}