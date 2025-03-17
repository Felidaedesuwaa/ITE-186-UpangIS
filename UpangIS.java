import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;

public class UpangIS extends JFrame {

    private JPanel mainPanel;
    private JPanel scholarshipPanel;
    private JPanel coursePanel;
    private JPanel cmaPanel;
    private JPanel celaPanel;
    private JPanel ccjePanel; 
    private CardLayout cardLayout;

    public UpangIS() {
        setTitle("UpangIS: Phinma UPang Information System");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        JPanel contentPane = new JPanel(cardLayout);
        setContentPane(contentPane);

        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.setBorder(new LineBorder(Color.RED));

        JLabel titleLabel = new JLabel("UpangIS: Phinma UPang Information System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalGlue());
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createVerticalGlue());

        scholarshipPanel = new JPanel();
        scholarshipPanel.setLayout(new BoxLayout(scholarshipPanel, BoxLayout.Y_AXIS));
        scholarshipPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(scholarshipPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Course Panel and Button (Corrected)
        coursePanel = new JPanel();
        coursePanel.setLayout(new BoxLayout(coursePanel, BoxLayout.Y_AXIS));
        coursePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane courseScrollPane = new JScrollPane(coursePanel);
        courseScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JButton cmaButton = new JButton("College of Management and Accountancy");
        cmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "cma");
                setSize(400, 200);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(cmaButton);

        JButton celaButton = new JButton("College of Education and Liberal Arts");
        celaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "cela");
                setSize(400, 200);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(celaButton);

        // College of Criminal Justice Education Button and Panel
        JButton ccjeButton = new JButton("College of Criminal Justice Education");
        ccjeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "ccje");
                setSize(400, 200);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(ccjeButton);

        JButton courseBackButton = new JButton("Back");
        courseBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "main");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(courseBackButton);
        contentPane.add(courseScrollPane, "course");

        // College of Management and Accountancy Panel
        cmaPanel = new JPanel();
        cmaPanel.setLayout(new BoxLayout(cmaPanel, BoxLayout.Y_AXIS));
        cmaPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane cmaScrollPane = new JScrollPane(cmaPanel);
        cmaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JButton bsaButton = new JButton("Bachelor of Science in Accountancy");
        bsaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsaDetails = "The Bachelor of Science in Accountancy program is a four-year course that prepares students for a professional career in Accountancy, particularly in Public Accounting.\n\n" +
                        "The program aims to guide students by providing them technical knowledge, skills, and abilities required in the accountancy profession.\n\n" +
                        "We also help them develop the values of integrity, independence, and skepticism necessary for making professional judgments.\n\n" +
                        "Our program uses a competency framework for professional accountants from the International Federation of Accountants,\n" +
                        "so that graduates may take certifications in Accountancy by the Philippine Professional Regulatory Commission and other international certifying bodies.";
                JOptionPane.showMessageDialog(UpangIS.this, bsaDetails);
            }
        });
        cmaPanel.add(bsaButton);
        JButton cmaBackButton = new JButton("Back");
        cmaBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(400, 150);
                setLocationRelativeTo(null);
            }
        });
        cmaPanel.add(cmaBackButton);
        contentPane.add(cmaScrollPane, "cma");

        // College of Education and Liberal Arts Panel
        celaPanel = new JPanel();
        celaPanel.setLayout(new BoxLayout(celaPanel, BoxLayout.Y_AXIS));
        celaPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane celaScrollPane = new JScrollPane(celaPanel);
        celaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JButton celaBackButton = new JButton("Back");
        celaBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(400, 150);
                setLocationRelativeTo(null);
            }
        });
        celaPanel.add(celaBackButton);
        contentPane.add(celaScrollPane, "cela");

        // College of Criminal Justice Education Panel
        ccjePanel = new JPanel();
        ccjePanel.setLayout(new BoxLayout(ccjePanel, BoxLayout.Y_AXIS));
        ccjePanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane ccjeScrollPane = new JScrollPane(ccjePanel);
        ccjeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JButton ccjeBackButton = new JButton("Back");
        ccjeBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(400, 150);
                setLocationRelativeTo(null);
            }
        });
        ccjePanel.add(ccjeBackButton);
        contentPane.add(ccjeScrollPane, "ccje");

        JButton phinmaScholarshipButton = new JButton("1. PHINMA Scholarship (formerly Presidential Scholarship)");
        phinmaScholarshipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String scholarshipDetails = "Benefits:\n" +
                        "100% discount on tuition & miscellaneous fees for 4 or 5 years\n" +
                        "₱4,000 monthly allowance for Honors or Top 10 Grade 12 students who passed the qualifying exam.\n\n" +
                        "Maintenance:\n" +
                        "Service of 2 hrs/day at assigned department\n" +
                        "No grade below 2.0\n" +
                        "Average must be 1.75 or above\n" +
                        "Applicable during summer if required in the curriculum.\n\n" +
                        "Requirements:\n" +
                        "Scholarship Acceptance letter from Office of the President\n" +
                        "Enrollment Registration";
                JOptionPane.showMessageDialog(UpangIS.this, scholarshipDetails);
            }
        });

        scholarshipPanel.add(phinmaScholarshipButton);

        JButton studentAssistanceButton = new JButton("2. Student Assistance Scholarship");
        studentAssistanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String assistanceDetails = "Benefits:\n" +
                        "100% off the tuition (21 units only)\n\n" +
                        "Eligibility:\n" +
                        "Must be in good class standing\n" +
                        "Service of 4 hours/day at the assigned department\n" +
                        "Must have passing grades\n" +
                        "Not applicable during summer.\n\n" +
                        "Requirements:\n" +
                        "Should pass the examination and interview";
                JOptionPane.showMessageDialog(UpangIS.this, assistanceDetails);
            }
        });

        scholarshipPanel.add(studentAssistanceButton);

        JButton valSalButton = new JButton("3. Valedictorian & Salutatorian Scholarship");
        valSalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valSalDetails = "Benefits:\n" +
                        "100% (Valedictorian) off the tuition for semester upon entry only.\n" +
                        "50% (Salutatorian) off the tuition for semester upon entry only.\n\n" +
                        "Requirements:\n" +
                        "Certificate from Principal\n" +
                        "Birth Certificate\n" +
                        "Enrollment Registration";
                JOptionPane.showMessageDialog(UpangIS.this, valSalDetails);
            }
        });

        scholarshipPanel.add(valSalButton);

        JButton deanListButton = new JButton("4. Dean's List Scholarship");
        deanListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String deanListDetails = "Benefits:\n" +
                        "100% coverage of tuition fees for the top 10 for the semester following the Dean’s List award\n" +
                        "50% off the tuition fee for the top 11-25 for the semester following the Dean’s List award\n\n" +
                        "Requirements:\n" +
                        "Grades (to be applied in the Registrar)";
                JOptionPane.showMessageDialog(UpangIS.this, deanListDetails);
            }
        });

        scholarshipPanel.add(deanListButton);

        JButton highestHonorButton = new JButton("5. With Highest Honor");
        highestHonorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String highestHonorDetails = "Benefits:\n" +
                        "100% off the tuition for semester upon entry only.\n\n" +
                        "Requirements:\n" +
                        "Certificate from Principal\n" +
                        "Birth Certificate\n" +
                        "Enrolment Registration";
                JOptionPane.showMessageDialog(UpangIS.this, highestHonorDetails);
            }
        });

        scholarshipPanel.add(highestHonorButton);

        JButton dependentScholarshipButton = new JButton("6. PHINMA UPang Direct Dependent Scholarship");
        dependentScholarshipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dependentDetails = "Benefits:\n" +
                        "100% (with duty) or 50% off the tuition fee\n\n" +
                        "Eligibility:\n" +
                        "Must be in good class standing\n" +
                        "No maintaining grade.\n" +
                        "Applicable during regular semester and summer.\n\n" +
                        "Requirements:\n" +
                        "Birth Certificate of the child to be presented to UPang HRD\n" +
                        "Certification of Employment from UPang HRD\n" +
                        "Enrollment Registration\n\n" +
                        "Maintenance:\n" +
                        "The student must be a part of the top 11-25 of the Dean’s List who are not Presidential, Gov. Moreno, OJH, 1 of 100, or College scholar.\n" +
                        "The student must not have a mark of Incomplete, Dropped or Failed.\n" +
                        "The student must have a full load or at least 21 units for irregular students.\n" +
                        "The student must not have any disciplinary sanction.";
                JOptionPane.showMessageDialog(UpangIS.this, dependentDetails);
            }
        });

        scholarshipPanel.add(dependentScholarshipButton);

        JButton hawakKamayButton = new JButton("7. Hawak Kamay Scholarship");
        hawakKamayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hawakKamayDetails = "Benefits:\n" +
                        "HK5.5 (₱5,500 per semester)\n" +
                        "HK7.5 ( as low as ₱7,500 per semester)\n" +
                        "HK10 ( as low as ₱10,000 per semester)\n" +
                        "HK12.5 (as low as ₱12,000 per semester)\n" +
                        "** Books and uniforms not included\n\n" +
                        "Requirements:\n" +
                        "Must pass exam given at the Marketing Dept.\n" +
                        "No maintaining grade";
                JOptionPane.showMessageDialog(UpangIS.this, hawakKamayDetails);
            }
        });

        scholarshipPanel.add(hawakKamayButton);

        JButton victoryLinerButton = new JButton("8. Victory Liner, 5-Star, and Transasia Oil Employee & Direct Dependent Scholarship");

        victoryLinerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String victoryLinerDetails = "Benefits:\n" +
                        "25% off the tuition fee\n" +
                        "Renewable as long as the parent is an employee of the above\n\n" +
                        "Eligibility:\n" +
                        "Must be in good class standing\n" +
                        "No maintaining grade\n" +
                        "Not applicable during summer.\n\n" +
                        "Requirements:\n" +
                        "Certificates of Employment of Parents\n" +
                        "Employment ID\"Birth Certificates of Child\n" +
                        "Enrollment Registration";
                JOptionPane.showMessageDialog(UpangIS.this, victoryLinerDetails);
            }
        });

        scholarshipPanel.add(victoryLinerButton);


        JButton medicalCityButton = new JButton("9. The Medical City Employee & Direct Dependent Scholarship");
        medicalCityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicalCityDetails = "Benefits:\n" +
                        "50% off the tuition fees\n" +
                        "Renewable as long as the parent is still connected in the TMC\n\n" +
                        "Eligibility:\n" +
                        "Must be in good class standing\n" +
                        "No maintaining grade\n" +
                        "Applicable during regular semester and summer\n\n" +
                        "Requirements:\n" +
                        "Certificates of Employment from TMC HR\n" +
                        "Employment ID\n" +
                        "Birth Certificates of Child\n" +
                        "Enrollment Registration";
                JOptionPane.showMessageDialog(UpangIS.this, medicalCityDetails);
            }
        });

        scholarshipPanel.add(medicalCityButton);

        JButton kapamilyaButton = new JButton("10. Kapamilya @ PHINMA UPang Scholarship");
        kapamilyaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kapamilyaDetails = "Benefits:\n" +
                        "10% off the tuition for 2 siblings, plus 5% to each additional sibling enrolled in the University (basic education or college)\n\n" +
                        "Eligibility:\n" +
                        "No maintaining grades\n" +
                        "Applicable during summer if required in the curriculum\n\n" +
                        "Requirements:\n" +
                        "Birth Certificates of each sibling\n" +
                        "Certificate of Matriculation";
                JOptionPane.showMessageDialog(UpangIS.this, kapamilyaDetails);
            }
        });

        scholarshipPanel.add(kapamilyaButton);

        JButton alumniButton = new JButton("11. PHINMA UPang Alumni Scholarship");
        alumniButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String alumniDetails = "Benefits:\n" +
                        "10% off the tuition fee for graduates of the University (including Basic Education) and their direct dependents\n\n" +
                        "Eligibility:\n" +
                        "Must be in good class standing\n" +
                        "No maintaining grade\n" +
                        "Not applicable during summer\n\n" +
                        "Requirements:\n" +
                        "Alumni card from Alumni Office / Parent’s Diploma / OTR\n" +
                        "Birth Certificate of the Child\n" +
                        "Enrollment Registration";
                JOptionPane.showMessageDialog(UpangIS.this, alumniDetails);
            }
        });

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "main");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });

        scholarshipPanel.add(phinmaScholarshipButton);
        scholarshipPanel.add(studentAssistanceButton);
        scholarshipPanel.add(valSalButton);
        scholarshipPanel.add(deanListButton);
        scholarshipPanel.add(highestHonorButton);
        scholarshipPanel.add(dependentScholarshipButton);
        scholarshipPanel.add(hawakKamayButton);
        scholarshipPanel.add(victoryLinerButton);
        scholarshipPanel.add(medicalCityButton);
        scholarshipPanel.add(kapamilyaButton);
        scholarshipPanel.add(alumniButton);
        contentPane.add(scrollPane, "scholarship");
        scholarshipPanel.add(backButton);

        JButton scholarshipButton = new JButton("Scholarship");
        JButton courseButton = new JButton("Course");

        scholarshipButton.setFont(new Font("Arial", Font.BOLD, 18));
        courseButton.setFont(new Font("Arial", Font.BOLD, 18));
        scholarshipButton.setPreferredSize(new Dimension(200, 50));
        courseButton.setPreferredSize(new Dimension(200, 50));

        scholarshipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "scholarship");
                setSize(400, 150);
                setLocationRelativeTo(null);
            }
        });

        scholarshipButton.setFont(new Font("Arial", Font.BOLD, 18));
        courseButton.setFont(new Font("Arial", Font.BOLD, 18));
        scholarshipButton.setPreferredSize(new Dimension(200, 50));
        courseButton.setPreferredSize(new Dimension(200, 50));

        scholarshipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "scholarship");
                setSize(400, 150);
                setLocationRelativeTo(null);
            }
        });

        courseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(400, 150);
                setLocationRelativeTo(null);
            }
        });

        
        mainPanel.add(scholarshipButton);
        mainPanel.add(courseButton);

        contentPane.add(mainPanel, "main");
        contentPane.add(scholarshipPanel, "scholarship");
        contentPane.add(coursePanel, "course");
        contentPane.add(cmaPanel, "cma");
        contentPane.add(celaPanel, "cela"); // Add the celaPanel to contentPane

        cardLayout.show(contentPane, "main");

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UpangIS();
            }
        });
    }
}