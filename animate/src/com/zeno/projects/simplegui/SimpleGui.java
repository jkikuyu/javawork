package com.zeno.projects.simplegui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Jude Kikuyu
 * date: 29/02/2016
 * Purpose: task 3 to display a simple dialog page
 */

public class SimpleGui extends JFrame {
    SimpleGui sgui;
    private JFileChooser fc;
    private JButton btnBrowse,btnClose,btnHelp,btnRun;
    private JComboBox cboRotate;
    private JCheckBox chkForce2, chkforce1;
    private JPanel pnlBand, pnlGoldenedge, pnlOutputfile, pnlRaster,
        pnlTransformations, pnlWindow, pnlcomputer;

    private JSeparator jSeparator;
    private JLabel lblBuffer, lblExtends, lblFormat,lblLength,lblMirror,
            lblMirrorx, lblMirrory, lblPolarity, lblProfileURx, lblRotate,
            lblScale, lblThreads, lblUM, lblUserProfiley, lblUserURx,
            lblUserURy, lblUserx, lblUsery, lblWidth, lblprofilex, lblprofiley;
    private JRadioButton rdbBMP, rdbBottom, rdbDPI, rdbDPM, rdbHoriz, rdbLeft,
            rdbNeg, rdbPixel, rdbPos, rdbRight, rdbTIFF, rdbTop, rdbUserdefined,
            rdbVertical;
    private JTextField txtDPI, txtDPM, txtFile, txtLength, txtMirrorx,
            txtMirrory, txtPixel, txtProfileURx, txtProfileURy, txtProfilex,
            txtProfiley, txtScale, txtThreads, txtUserURx, txtUserURy, txtUserx,
            txtUsery, txtWidth, txtbuffer;
    //GroupLayout pnlWindowLayout;
    private Font fnt;

    public SimpleGui(){
          initialize();
          setProperties();
          setLayout();

    }
    // initialise variables
    public void initialize(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
               } catch (ClassNotFoundException ex) {
            Logger.getLogger(SimpleGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SimpleGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SimpleGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SimpleGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        // font
        fnt = new Font("Trebuchet MS", 0, 11);
        //panels
        this.pnlWindow = new JPanel();
        this.pnlRaster = new javax.swing.JPanel();
        this.pnlGoldenedge = new JPanel();
        this.pnlTransformations = new JPanel();
        this.pnlBand = new JPanel();
        this.pnlcomputer = new JPanel();
        this.pnlOutputfile = new JPanel();
        //layouts
        //pnlWindowLayout= new GroupLayout(pnlWindow);

        this.btnRun = new JButton();
        this.btnClose = new JButton();
        this.btnHelp = new JButton();
        this.btnBrowse  = new JButton();
        this.txtProfilex = new JTextField();
        this.txtProfiley = new JTextField();
        this.txtProfileURx = new JTextField();
        this.txtProfileURy = new JTextField();
        this.txtUserURy = new JTextField();
        this.txtUserx = new JTextField();
        this.txtUsery = new JTextField();
        this.txtUserURx = new JTextField();
        this.txtDPI = new JTextField();
        this.txtDPM = new JTextField();
        this.txtScale = new JTextField();
        this.txtMirrorx = new JTextField();
        this.txtMirrory = new JTextField();
        this.txtFile = new JTextField();
        this.txtThreads = new JTextField();
        this.txtWidth = new JTextField();
        this.txtbuffer = new JTextField();
        this.txtLength = new JTextField();
        this.txtPixel= new JTextField();
        this.rdbUserdefined = new JRadioButton();
        this.rdbPixel = new JRadioButton();
        this.rdbDPI = new JRadioButton();
        this.rdbDPM = new JRadioButton();
        this.rdbTop = new JRadioButton();
        this.rdbBottom = new JRadioButton();
        this.rdbPos = new javax.swing.JRadioButton();
        this.rdbNeg = new javax.swing.JRadioButton();
        this.rdbHoriz = new JRadioButton();
        this.rdbVertical = new JRadioButton();
        this.rdbBMP = new JRadioButton();
        this.rdbTIFF = new JRadioButton();

        this.rdbRight = new JRadioButton();
        this.rdbLeft = new JRadioButton();

        this.lblprofilex = new JLabel();
        this.lblExtends = new JLabel();
        this.lblUserx = new JLabel();
        this.lblprofiley = new JLabel();
        this.lblUsery = new JLabel();
        this.lblProfileURx = new JLabel();
        this.lblUserProfiley = new JLabel();
        this.lblUserURx = new JLabel();
        this.lblUserURy = new JLabel();
        this.lblUM = new JLabel();
        this.lblRotate = new JLabel();
        this.lblScale = new JLabel();
        this.lblMirrorx = new JLabel();
        this.lblMirror = new JLabel();
        this.lblMirrory = new JLabel();
        this.lblFormat = new JLabel();
        this.lblBuffer = new JLabel();
        this.lblThreads = new JLabel();
        this.lblWidth = new JLabel();
        this.lblLength = new JLabel();
        this.lblPolarity = new JLabel();
        this.jSeparator = new JSeparator();
        this.cboRotate = new JComboBox();

        chkforce1 = new JCheckBox();
        chkForce2 = new JCheckBox();

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pnlWindow.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY), "Window"));
        GroupLayout windowLayout = new GroupLayout(pnlWindow);
        pnlWindow.setLayout(windowLayout);
        windowLayout.setHorizontalGroup(windowLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 280, Short.MAX_VALUE));
        windowLayout.setVerticalGroup(windowLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 115, Short.MAX_VALUE));
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(pnlWindow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addContainerGap(200, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(pnlWindow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addContainerGap(200, Short.MAX_VALUE)));
        fc = new JFileChooser();
    }
    // setup the properties
    protected void setProperties(){
        lblExtends.setText("Extends from Profile");
        lblUserx.setFont(fnt);
        lblUserx.setText("LLx");
        lblprofiley.setFont(fnt);
        lblprofiley.setText("LLy");
        lblprofilex.setFont(fnt);
        lblprofilex.setText("LLx");

        lblUsery.setFont(fnt);
        lblUsery.setText("LLy");
        lblProfileURx.setFont(fnt);
        lblProfileURx.setText("URx");
        lblUserProfiley.setFont(fnt);
        lblUserProfiley.setText("URy");
        lblUserURx.setFont(fnt);
        lblUserURx.setText("URx");
        lblUserURy.setFont(fnt); 
        lblUserURy.setText("URy");

        txtUserURx.setText(" ");
        txtUserURy.setText(" ");
        txtUserx.setText(" ");
        txtUsery.setText(" ");


    }
    // setup the layout
    protected void setLayout(){

        GroupLayout pnlWindowLayout = new GroupLayout(pnlWindow);
        pnlWindow.setLayout(pnlWindowLayout);
        pnlWindowLayout.setHorizontalGroup(
            pnlWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlWindowLayout.createSequentialGroup()
                .addGroup(pnlWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWindowLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblExtends))
                    .addGroup(pnlWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(rdbUserdefined, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlWindowLayout.createSequentialGroup()
                                .addGroup(pnlWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlWindowLayout.createSequentialGroup()
                                        .addComponent(lblprofilex)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtProfilex, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblprofiley)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtProfiley, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblProfileURx))
                                    .addGroup(pnlWindowLayout.createSequentialGroup()
                                        .addGap(175, 175, 175)
                                        .addComponent(lblUserURx)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUserURx)
                                    .addComponent(txtProfileURx, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlWindowLayout.createSequentialGroup()
                                        .addComponent(lblUserProfiley)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtProfileURy))
                                    .addGroup(pnlWindowLayout.createSequentialGroup()
                                        .addComponent(lblUserURy)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtUserURy, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pnlWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUserx)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserx, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUsery)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsery, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        pnlWindowLayout.setVerticalGroup(
            pnlWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlWindowLayout.createSequentialGroup()
                .addGroup(pnlWindowLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(txtProfileURx, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProfileURy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlWindowLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlWindowLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlWindowLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txtProfiley, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblProfileURx)))
                        .addGroup(GroupLayout.Alignment.LEADING, pnlWindowLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(txtProfilex, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(GroupLayout.Alignment.LEADING, pnlWindowLayout.createSequentialGroup()
                            .addComponent(lblExtends)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnlWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(lblprofilex, GroupLayout.Alignment.TRAILING)
                                .addComponent(lblprofiley, GroupLayout.Alignment.TRAILING)
                                .addComponent(lblUserProfiley, GroupLayout.Alignment.TRAILING)))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(rdbUserdefined)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlWindowLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserx)
                    .addComponent(txtUserx, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsery)
                    .addComponent(txtUsery, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserURx, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserURy)
                    .addComponent(txtUserURy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserURx)))
        );

        pnlRaster.setBorder(BorderFactory.createTitledBorder(null, "Raster Settings", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, fnt));

        rdbPixel.setFont(fnt);
        rdbPixel.setText("PIXEL SIZE");

        rdbUserdefined.setFont(fnt);
        rdbUserdefined.setText("User Defined");
        rdbDPI.setFont(fnt);
        rdbDPI.setText("DPI");

        rdbDPM.setFont(fnt);
        rdbDPM.setText("DPM");

        txtDPI.setFont(fnt); 
        txtDPI.setText(" ");

        txtDPM.setFont(fnt); 
        txtDPM.setText(" ");

        txtPixel.setFont(fnt); 
        //txtPixel.setText(" ");
        lblUM.setText("(UM)");

        GroupLayout pnlRasterLayout = new GroupLayout(pnlRaster);
        pnlRaster.setLayout(pnlRasterLayout);
        pnlRasterLayout.setHorizontalGroup(
            pnlRasterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlRasterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRasterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(rdbPixel)
                    .addComponent(rdbDPI)
                    .addComponent(rdbDPM, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addGroup(pnlRasterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRasterLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRasterLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDPM, GroupLayout.Alignment.LEADING)
                            .addComponent(txtPixel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                    .addGroup(GroupLayout.Alignment.TRAILING, pnlRasterLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDPI, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUM)
                .addGap(389, 389, 389))
        );
        pnlRasterLayout.setVerticalGroup(
            pnlRasterLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlRasterLayout.createSequentialGroup()
                .addGroup(pnlRasterLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbDPI)
                    .addComponent(txtDPI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(pnlRasterLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(rdbDPM)
                    .addComponent(txtDPM, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRasterLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbPixel)
                    .addComponent(txtPixel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUM))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlGoldenedge.setBorder(BorderFactory.createTitledBorder(null, "Golden Edges", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, fnt));

        rdbTop.setText("TOP");

        rdbBottom.setText("BOTTOM");

        rdbRight.setText("RIGHT");

        rdbLeft.setText("LEFT");

        GroupLayout pnlGoldenedgeLayout = new GroupLayout(pnlGoldenedge);
        pnlGoldenedge.setLayout(pnlGoldenedgeLayout);
        pnlGoldenedgeLayout.setHorizontalGroup(
            pnlGoldenedgeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlGoldenedgeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGoldenedgeLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                     .addGroup(pnlGoldenedgeLayout.createSequentialGroup()
                        .addComponent(rdbTop)
                        .addGap(20, 20, 20)
                        .addComponent(rdbBottom))
                    .addGroup(pnlGoldenedgeLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rdbLeft)
                        .addGap(18, 18, 18)
                        .addComponent(rdbRight)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pnlGoldenedgeLayout.setVerticalGroup(
            pnlGoldenedgeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlGoldenedgeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jSeparator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlGoldenedgeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGoldenedgeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbBottom)
                    .addComponent(rdbTop))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGap(1, 1, 1)
                .addGroup(pnlGoldenedgeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbLeft)
                    .addComponent(rdbRight)))
        );


        pnlTransformations.setBorder(BorderFactory.createTitledBorder(null, "Transformations", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, fnt)); 

        rdbPos.setFont(fnt);
        rdbPos.setText("POS");

        rdbNeg.setFont(fnt);
        rdbNeg.setText("NEG");

        lblScale.setFont(fnt);
        lblScale.setText("SCALE");

        txtScale.setText(" ");

        lblMirror.setFont(fnt);
        lblMirror.setText("MIRROR");

        lblRotate.setFont(fnt);
        lblRotate.setText("ROTATE");

        txtMirrorx.setFont(fnt);
        txtMirrorx.setText(" ");

        lblMirrorx.setFont(fnt);
        lblMirrorx.setText("X");

        txtMirrory.setFont(fnt);
        txtMirrory.setText(" ");

        lblMirrory.setFont(fnt);
        lblMirrory.setText("Y");

        cboRotate.setFont(fnt);
        cboRotate.setModel(new DefaultComboBoxModel(new String[] { "90", "180", "270", "360" }));

        lblPolarity.setFont(fnt);
        lblPolarity.setText("POLARITY");

        GroupLayout pnlTransformationsLayout = new GroupLayout(pnlTransformations);
        pnlTransformations.setLayout(pnlTransformationsLayout);
        pnlTransformationsLayout.setHorizontalGroup(
            pnlTransformationsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransformationsLayout.createSequentialGroup()
                .addGroup(pnlTransformationsLayout.createParallelGroup
                (GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTransformationsLayout.createParallelGroup
                    (GroupLayout.Alignment.TRAILING)
                        .addComponent(txtMirrory, GroupLayout.PREFERRED_SIZE, 29,
                        GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlTransformationsLayout.createSequentialGroup()
                            .addGroup(pnlTransformationsLayout.createParallelGroup
                            (GroupLayout.Alignment.TRAILING)
                                .addComponent(lblMirror)
                                .addGroup(pnlTransformationsLayout.
                                createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMirrory,
                                    GroupLayout.Alignment.TRAILING, GroupLayout.
                                    DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                    Short.MAX_VALUE)
                                    .addComponent(lblMirrorx,
                                    GroupLayout.Alignment.TRAILING)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.
                            UNRELATED)
                            .addComponent(txtMirrorx, GroupLayout.PREFERRED_SIZE,
                            29, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlTransformationsLayout.createSequentialGroup()
                        .addComponent(lblScale)
                        .addGap(18, 18, 18)
                        .addComponent(txtScale, GroupLayout.PREFERRED_SIZE, 77,
                        GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTransformationsLayout.createSequentialGroup()
                        .addComponent(lblRotate)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboRotate, GroupLayout.PREFERRED_SIZE,
                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTransformationsLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(pnlTransformationsLayout.createParallelGroup
                        (GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPolarity)
                            .addGroup(pnlTransformationsLayout.createParallelGroup
                            (GroupLayout.Alignment.LEADING)
                                .addComponent(rdbNeg)
                                .addComponent(rdbPos)))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTransformationsLayout.setVerticalGroup(
            pnlTransformationsLayout.createParallelGroup
            (GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransformationsLayout.createSequentialGroup()
                .addGroup(pnlTransformationsLayout.createParallelGroup
                (GroupLayout.Alignment.BASELINE)
                    .addComponent(lblScale)
                    .addComponent(txtScale, GroupLayout.PREFERRED_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTransformationsLayout.createParallelGroup
                (GroupLayout.Alignment.LEADING)
                    .addComponent(lblMirror)
                    .addGroup(pnlTransformationsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlTransformationsLayout.createParallelGroup
                        (GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMirrorx)
                            .addComponent(txtMirrorx, GroupLayout.PREFERRED_SIZE,
                            GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTransformationsLayout.createParallelGroup
                (GroupLayout.Alignment.LEADING)
                    .addComponent(txtMirrory, GroupLayout.PREFERRED_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMirrory))
                .addGap(11, 11, 11)
                .addGroup(pnlTransformationsLayout.createParallelGroup
                (GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRotate)
                    .addComponent(cboRotate, GroupLayout.PREFERRED_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPolarity)
                .addGap(3, 3, 3)
                .addComponent(rdbPos)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbNeg)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlOutputfile.setBorder(BorderFactory.createTitledBorder(null,
                "Output File", TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION, fnt));

        rdbBMP.setFont(fnt);
        rdbBMP.setText("BMP");

        txtFile.setFont(fnt);
        txtFile.setText(" ");
        rdbTIFF.setFont(fnt);
        rdbTIFF.setText("TIFF");


        lblFormat.setFont(fnt);
        lblFormat.setText("FORMAT");

        GroupLayout pnlOutputfileLayout = new GroupLayout(pnlOutputfile);
        pnlOutputfile.setLayout(pnlOutputfileLayout);
        pnlOutputfileLayout.setHorizontalGroup(
            pnlOutputfileLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutputfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOutputfileLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOutputfileLayout.createSequentialGroup()
                        .addComponent(rdbBMP)
                        .addGap(29, 29, 29)
                        .addComponent(rdbTIFF))
                    .addGroup(pnlOutputfileLayout.createSequentialGroup()
                        .addComponent(lblFormat)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                        99, GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFile, GroupLayout.DEFAULT_SIZE, 139,
                    Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrowse, GroupLayout.PREFERRED_SIZE, 79,
                GroupLayout.PREFERRED_SIZE))
        );
        pnlOutputfileLayout.setVerticalGroup(
            pnlOutputfileLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pnlOutputfileLayout.
            createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(pnlOutputfileLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFile, GroupLayout.PREFERRED_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse))
                .addGap(18, 18, 18)
                .addComponent(lblFormat)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlOutputfileLayout.createParallelGroup
                (GroupLayout.Alignment.CENTER)
                    .addComponent(rdbTIFF)
                    .addComponent(rdbBMP)))
        );

        pnlcomputer.setBorder(BorderFactory.createTitledBorder(null,
                "Computer Settings",TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION, fnt));

        txtbuffer.setFont(fnt);
        txtbuffer.setText(" ");

        lblBuffer.setFont(fnt); 
        lblBuffer.setText("Buffer RAM (MByte");

        lblThreads.setFont(fnt); 
        lblThreads.setText("Number of Threads:");

        txtThreads.setFont(fnt); 
        txtThreads.setText(" ");

        GroupLayout pnlcomputerLayout = new GroupLayout(pnlcomputer);
        pnlcomputer.setLayout(pnlcomputerLayout);
        pnlcomputerLayout.setHorizontalGroup(
            pnlcomputerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlcomputerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlcomputerLayout.createParallelGroup(GroupLayout.
                Alignment.LEADING)
                    .addComponent(lblBuffer)
                    .addComponent(lblThreads))
                .addGap(18, 18, 18)
                .addGroup(pnlcomputerLayout.createParallelGroup(GroupLayout.
                Alignment.LEADING, false)
                    .addComponent(txtThreads)
                    .addComponent(txtbuffer, GroupLayout.DEFAULT_SIZE, 52,
                    Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        pnlcomputerLayout.setVerticalGroup(
            pnlcomputerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlcomputerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlcomputerLayout.createParallelGroup(GroupLayout.
                Alignment.BASELINE)
                    .addComponent(lblBuffer)
                    .addComponent(txtbuffer, GroupLayout.PREFERRED_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlcomputerLayout.createParallelGroup(GroupLayout
                .Alignment.BASELINE)
                    .addComponent(lblThreads)
                    .addComponent(txtThreads, GroupLayout.PREFERRED_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pnlBand.setBorder(BorderFactory.createTitledBorder(null, "Band Control", 
                TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION,
                fnt));

        txtWidth.setFont(fnt);
        txtWidth.setText(" ");

        lblWidth.setFont(fnt);
        lblWidth.setText("WIDTH (PIXELS)");

        lblLength.setFont(fnt);
        lblLength.setText("LENGTH(PIXELS)");

        txtLength.setFont(fnt);
        txtLength.setText(" ");

        rdbHoriz.setFont(fnt);
        rdbHoriz.setText("HORIZ");

        rdbVertical.setFont(fnt);
        rdbVertical.setText("VERTICAL");

        chkforce1.setText("FORCE");

        chkForce2.setText("FORCE");

        GroupLayout pnlBandLayout = new GroupLayout(pnlBand);
        pnlBand.setLayout(pnlBandLayout);
        pnlBandLayout.setHorizontalGroup(
            pnlBandLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlBandLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBandLayout.createParallelGroup(GroupLayout
                .Alignment.LEADING)
                    .addGroup(pnlBandLayout.createSequentialGroup()
                        .addGroup(pnlBandLayout.createParallelGroup(GroupLayout
                        .Alignment.LEADING)
                            .addGroup(pnlBandLayout.createSequentialGroup()
                                .addComponent(chkForce2)
                                .addGap(18, 18, 18)
                                .addComponent(lblLength))
                            .addGroup(pnlBandLayout.createSequentialGroup()
                                .addComponent(chkforce1)
                                .addGap(18, 18, 18)
                                .addComponent(lblWidth)))
                        .addGap(4, 4, 4)
                        .addGroup(pnlBandLayout.createParallelGroup(GroupLayout
                        .Alignment.LEADING, false)
                            .addComponent(txtLength)
                            .addComponent(txtWidth, GroupLayout.DEFAULT_SIZE, 43,
                            Short.MAX_VALUE)))
                    .addGroup(pnlBandLayout.createSequentialGroup()
                        .addComponent(rdbHoriz)
                        .addGap(29, 29, 29)
                        .addComponent(rdbVertical)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlBandLayout.setVerticalGroup(
            pnlBandLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pnlBandLayout
            .createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBandLayout.createParallelGroup(GroupLayout
                .Alignment.BASELINE)
                    .addComponent(rdbHoriz)
                    .addComponent(rdbVertical))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9,
                Short.MAX_VALUE)
                .addGroup(pnlBandLayout.createParallelGroup(GroupLayout
                .Alignment.CENTER)
                    .addComponent(txtWidth, GroupLayout.PREFERRED_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWidth)
                    .addComponent(chkforce1))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBandLayout.createParallelGroup(GroupLayout.
                Alignment.CENTER)
                    .addComponent(txtLength, GroupLayout.PREFERRED_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLength)
                    .addComponent(chkForce2))
                .addGap(11, 11, 11))
        );
        // assign listeners to buttons
        btnHelp.setText("Help");
        btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        btnRun.setText("Run");
        btnRun.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        btnBrowse.setText("Browse ...");
        btnBrowse.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        btnClose.setText("Close");
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.
                        Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.
                                Alignment.TRAILING)
                                    .addComponent(pnlGoldenedge, GroupLayout.
                                    PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                    GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlRaster, GroupLayout.
                                    PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.
                                UNRELATED)
                                .addComponent(pnlTransformations, GroupLayout.
                                PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlWindow, GroupLayout.PREFERRED_SIZE,
                            376, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnRun, GroupLayout.PREFERRED_SIZE, 66,
                        GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 66,
                        GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnHelp, GroupLayout.PREFERRED_SIZE, 66,
                        GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlcomputer, GroupLayout.DEFAULT_SIZE,
                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(pnlBand, GroupLayout.DEFAULT_SIZE,
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlOutputfile, GroupLayout.DEFAULT_SIZE,
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlOutputfile, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlWindow, GroupLayout.PREFERRED_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlRaster, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlGoldenedge, GroupLayout
                                .PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlcomputer, GroupLayout
                                .PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlBand, GroupLayout.DEFAULT_SIZE,
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout
                        .Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(GroupLayout
                            .Alignment.BASELINE)
                                .addComponent(btnClose)
                                .addComponent(btnHelp, GroupLayout.PREFERRED_SIZE,
                                24, GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRun)))
                    .addComponent(pnlTransformations, GroupLayout.PREFERRED_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

    }
    public void createAndShowWindow(JFrame c){
        c.setTitle("Task 3");
        c.pack();
        c.setVisible(true);

    }
    // actions performed when buttons are clicked
    private void btnHelpActionPerformed(ActionEvent evt) {

       JOptionPane.showMessageDialog(sgui,"Help button clicked.");
    }
    private void btnCloseActionPerformed(ActionEvent evt) {

       JOptionPane.showMessageDialog(sgui,"Close button clicked.");
    }
    private void btnRunActionPerformed(ActionEvent evt) {

       JOptionPane.showMessageDialog(sgui,"Run button clicked.");
    }
    private void btnBrowseActionPerformed(ActionEvent evt) {
    if (evt.getSource() == this.btnBrowse) {
        int returnVal = fc.showOpenDialog(SimpleGui.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();

            log.append("Opening: " + file.getName() + "." + newline);
        } else {
           // log.append("Open command cancelled by user." + newline);
        }
    }
    } 

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this Simple GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SimpleGui sgui = new SimpleGui();
                sgui.createAndShowWindow(sgui);
            }
        });
    }

}