
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
    private JPanel ceaPanel;
    private JPanel cahsPanel;
    private JPanel citPanel;
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

        JLabel titleLabel = new JLabel("Welcome to the Phinma UPang Information System!");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
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
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(cmaButton);

        JButton celaButton = new JButton("College of Education and Liberal Arts");
        celaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "cela");
                setSize(600, 600);
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
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(ccjeButton);

        // College of Engineering and Architecture Button and Panel
        JButton ceaButton = new JButton("College of Engineering and Architecture");
        ceaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "cea");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(ceaButton);

        // College of Allied Health Sciences Button and Panel
        JButton cahsButton = new JButton("College of Allied Health Sciences");
        cahsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "cahs");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(cahsButton);

        // College of Information Technology Button and Panel
        JButton citButton = new JButton("College of Information Technology");
        citButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "cit");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        coursePanel.add(citButton);

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
                String bsaDetails = "Bachelor of Science in Accountancy\n\n" +
                        "The Bachelor of Science in Accountancy program is a four-year course that prepares students for a professional career in Accountancy, particularly in Public Accounting.\n\n"
                        +
                        "The program aims to guide students by providing them technical knowledge, skills and abilities required in the accountancy profession.\n\n"
                        +
                        "We also help them develop the values of integrity, independence and skepticism necessary for making professional judgments.\n\n"
                        +
                        "Our program uses a competency framework for professional accountants from the International Federation of Accountants, so that graduates may take certifications in Accountancy by the Philippine Professional Regulatory Commission and other international certifying bodies.";
                JOptionPane.showMessageDialog(UpangIS.this, bsaDetails);
            }
        });
        cmaPanel.add(bsaButton);
        JButton bsmaButton = new JButton("Bachelor of Science in Management Accounting");
        bsmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsmaDetails = "Bachelor of Science in Management Accounting\n\n" +
                        "The Bachelor of Science in Management Accounting program emphasizes the development of technical knowledge, skills, and values necessary for a successful career in management accounting.\n\n"
                        +
                        "Our curriculum is designed to provide students with a strong foundation in accounting principles, financial analysis, cost management, and strategic decision-making.\n\n"
                        +
                        "Graduates of our program are well-prepared to pursue professional certifications in management accounting, enabling them to demonstrate their expertise and enhance their career prospects.";
                JOptionPane.showMessageDialog(UpangIS.this, bsmaDetails);
            }
        });
        cmaPanel.add(bsmaButton);

        JButton bsatButton = new JButton("Bachelor of Science in Accountancy Technology");
        bsatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsatDetails = "Bachelor of Science in Accountancy Technology\n\n" +
                        "The Bachelor of Science in Accounting Technology program focuses on cultivating the technical expertise, skills, and values essential for a thriving career in accounting management.\n\n"
                        +
                        "Our curriculum is meticulously crafted to furnish students with a robust grounding in accounting principles, financial analysis, cost management, and strategic decision-making.\n\n"
                        +
                        "Upon completion, our graduates are adeptly equipped to pursue professional certifications in accounting management, showcasing their proficiency and elevating their career opportunities.";
                JOptionPane.showMessageDialog(UpangIS.this, bsatDetails);
            }
        });
        cmaPanel.add(bsatButton);

        JButton bshmButton = new JButton("Bachelor of Science in Hospitality Management");
        bshmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bshmDetails = "Bachelor of Science in Hospitality Management\n\n" +
                        "The Bachelor of Science in Hospitality Management is a program which trains students in a diverse set of skills necessary to Hospitality professionals.\n\n"
                        +
                        "Using experiential teaching methods, we hone their skills in Housekeeping, Front Office, Food and Beverage Services, Culinary, Events Planning and Cruise Line Operations.\n\n"
                        +
                        "We develop their communication skills so they can properly address the needs and preferences of guests as professionals.\n\n"
                        +
                        "We also teach our students the values of cultural diversity, sensitivity and versatility needed in working with and serving guests from different cultures.\n\n"
                        +
                        "Most importantly, the program provides students the opportunity to earn local and international certifications and diplomas (TESDA, American Hospitality and Lodging Education Institute, School D’ Hospitality of Singapore) to make them globally-competitive.";
                JOptionPane.showMessageDialog(UpangIS.this, bshmDetails);
            }
        });
        cmaPanel.add(bshmButton);

        JButton bstmButton = new JButton("Bachelor of Science in Tourism Management");
        bstmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bstmDetails = "Bachelor of Science in Tourism Management\n\n" +
                        "The Bachelor of Science in Tourism Management trains students in a diverse set of skills necessary for their future careers.\n\n"
                        +
                        "We use the active learning methodology in honing students’ skills in functional areas like Front Office, Events Planning, Cruise Line Operations, and Travel and Tours.\n\n"
                        +
                        "We develop their communication skills so they can properly guide guests through destinations and address their needs and concerns.\n\n"
                        +
                        "We also teach our students the values of cultural diversity, sensitivity and versatility needed in touring guests from different cultures.\n\n"
                        +
                        "Most importantly, we instill within them the value of our heritage and culture, so that they may best represent the country as our ambassadors.\n\n"
                        +
                        "Our program provides students the chance to earn local and international certifications and diplomas (TESDA, American Hospitality and Lodging Education Institute, School D’ Hospitality of Singapore) for prestigious local and global employment opportunities.";
                JOptionPane.showMessageDialog(UpangIS.this, bstmDetails);
            }
        });
        cmaPanel.add(bstmButton);
        JButton bsbaButton = new JButton("Bachelor of Science in Business Administration");
        bsbaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsbaDetails = "Bachelor of Science in Business Administration\n\n" +
                        "The Bachelor of Science in Business Administration (BSBA) program through its various fields of specializations guides students to become competent finance, marketing, and human resource professionals.\n\n"
                        +
                        "Graduates are also prepared to become successful entrepreneurs and business leaders.\n\n" +
                        "Through a competency-based curriculum, students are able to hone basic business skills such as financial analysis, business administration, project management, and product presentation through research and feasibility studies.\n\n"
                        +
                        "We help them identify trends and developments in various business industries to prepare them ahead of the real world.\n\n"
                        +
                        "We engage in partnerships with industry leaders so they can learn how to work in an actual office setting.\n\n"
                        +
                        "We also develop their communication, critical thinking, and problem solving skills.\n\n" +
                        "Lastly, but not the least, we teach them the values of resourcefulness, creativity, discipline and teamwork.";
                JOptionPane.showMessageDialog(UpangIS.this, bsbaDetails);
            }
        });
        cmaPanel.add(bsbaButton);
        JButton bsbaMmButton = new JButton(
                "Bachelor of Science in Business Administration Major in Marketing Management");
        bsbaMmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsbaDetails = "Bachelor of Science in Business Administration\n\n" +
                        "The Bachelor of Science in Business Administration (BSBA) program through its various fields of specializations guides students to become competent finance, marketing, and human resource professionals.\n\n"
                        +
                        "Graduates are also prepared to become successful entrepreneurs and business leaders.\n\n" +
                        "Through a competency-based curriculum, students are able to hone basic business skills such as financial analysis, business administration, project management, and product presentation through research and feasibility studies.\n\n"
                        +
                        "We help them identify trends and developments in various business industries to prepare them ahead of the real world.\n\n"
                        +
                        "We engage in partnerships with industry leaders so they can learn how to work in an actual office setting.\n\n"
                        +
                        "We also develop their communication, critical thinking, and problem solving skills.\n\n" +
                        "Lastly, but not the least, we teach them the values of resourcefulness, creativity, discipline and teamwork.";
                JOptionPane.showMessageDialog(UpangIS.this, bsbaDetails);
            }
        });
        cmaPanel.add(bsbaButton);

        JButton bsbaFmButton = new JButton(
                "Bachelor of Science in Business Administration Major in Financial Management");
        bsbaFmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsbaMmDetails = "Bachelor of Science in Business Administration Major in Marketing Management\n\n"
                        +
                        "The Bachelor of Science in Business Administration (BSBA) program through its various fields of specializations guides students to become competent finance, marketing, and human resource professionals.\n\n"
                        +
                        "Graduates are also prepared to become successful entrepreneurs and business leaders.\n\n" +
                        "Through a competency-based curriculum, students are able to hone basic business skills such as financial analysis, business administration, project management, and product presentation through research and feasibility studies.\n\n"
                        +
                        "We help them identify trends and developments in various business industries to prepare them ahead of the real world.\n\n"
                        +
                        "We engage in partnerships with industry leaders so they can learn how to work in an actual office setting.\n\n"
                        +
                        "We also develop their communication, critical thinking, and problem solving skills.\n\n" +
                        "Lastly, but not the least, we teach them the values of resourcefulness, creativity, discipline and teamwork.";
                JOptionPane.showMessageDialog(UpangIS.this, bsbaMmDetails);
            }
        });
        cmaPanel.add(bsbaButton);

        JButton cmaBackButton = new JButton("Back");
        cmaBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
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

        JButton abPolSciButton = new JButton("Bachelor of Arts in Political Science");
        abPolSciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String abPolSciDetails = "Bachelor of Arts in Political Science\n\n" +
                        "The Bachelor of Arts in Political Science (AB Political Science) is a comprehensive academic program tailored to prepare students for roles in the dynamic field of political science.\n\n"
                        +
                        "This program combines theoretical insights with practical applications to impart the necessary knowledge and skills for understanding political systems, policy analysis, and global affairs.\n\n"
                        +
                        "With a focus on critical thinking, research, and effective communication, our curriculum equips students to analyze political structures, engage in informed discourse, and contribute meaningfully to the democratic process.\n\n"
                        +
                        "Graduates of our program are well-positioned for a range of careers in government, international relations, law, advocacy, and public service.";
                JOptionPane.showMessageDialog(UpangIS.this, abPolSciDetails);
            }
        });
        celaPanel.add(abPolSciButton);

        JButton bEdButton = new JButton("Bachelor of Education");
        bEdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bEdDetails = "Bachelor of Education\n\n" +
                        "Bachelor of Education";
                JOptionPane.showMessageDialog(UpangIS.this, bEdDetails);
            }
        });
        celaPanel.add(bEdButton);

        JButton bseeButton = new JButton("Bachelor of Science in Elementary Education");
        bseeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bseeDetails = "Bachelor of Science in Elementary Education\n\n" +
                        "The Bachelor of Science in Elementary Education (BSEE) is a four-year degree program meticulously crafted to equip students for a career as elementary school educators.\n\n"
                        +
                        "This program seamlessly integrates theory and practical training, ensuring that students acquire the essential knowledge and skills required for effective teaching in elementary schools.\n\n"
                        +
                        "Our overarching goal is to cultivate competent educators who foster a conducive learning environment for their students.";
                JOptionPane.showMessageDialog(UpangIS.this, bseeDetails);
            }
        });
        celaPanel.add(bseeButton);

        JButton bsedButton = new JButton("Bachelor of Secondary Education");
        bsedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsedDetails = "Bachelor of Secondary Education\n\n" +
                        "Bachelor of Secondary Education (BSED) is a four year degree program designed to prepare students for becoming high school teachers.\n\n"
                        +
                        "The program combines both theory and practice in order to teach students the necessary knowledge and skills a high school teacher needs.\n\n"
                        +
                        "The program aims to produce competent teachers who provide a conducive learning experience to their students.";
                JOptionPane.showMessageDialog(UpangIS.this, bsedDetails);
            }
        });
        celaPanel.add(bsedButton);

        JButton bsedEnglishButton = new JButton("Bachelor of Secondary Education Major in English");
        bsedEnglishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsedEnglishDetails = "Bachelor of Secondary Education Major in English\n\n" +
                        "Bachelor of Secondary Education (BSED) is a four year degree program designed to prepare students for becoming high school teachers.\n\n"
                        +
                        "The program combines both theory and practice in order to teach students the necessary knowledge and skills a high school teacher needs.\n\n"
                        +
                        "The program aims to produce competent teachers who provide a conducive learning experience to their students.\n\n"
                        +
                        "Major in: English";
                JOptionPane.showMessageDialog(UpangIS.this, bsedEnglishDetails);
            }
        });
        celaPanel.add(bsedEnglishButton);

        JButton bsedMathButton = new JButton("Bachelor of Secondary Education Major in Math");
        bsedMathButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsedMathDetails = "Bachelor of Secondary Education Major in Math\n\n" +
                        "Bachelor of Secondary Education (BSED) is a four year degree program designed to prepare students for becoming high school teachers.\n\n"
                        +
                        "The program combines both theory and practice in order to teach students the necessary knowledge and skills a high school teacher needs.\n\n"
                        +
                        "The program aims to produce competent teachers who provide a conducive learning experience to their students.\n\n"
                        +
                        "Major in: Math";
                JOptionPane.showMessageDialog(UpangIS.this, bsedMathDetails);
            }
        });
        celaPanel.add(bsedMathButton);

        JButton bsedScienceButton = new JButton("Bachelor of Secondary Education Major in Science");
        bsedScienceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsedScienceDetails = "Bachelor of Secondary Education Major in Science\n\n" +
                        "Bachelor of Secondary Education (BSED) is a four year degree program designed to prepare students for becoming high school teachers.\n\n"
                        +
                        "The program combines both theory and practice in order to teach students the necessary knowledge and skills a high school teacher needs.\n\n"
                        +
                        "The program aims to produce competent teachers who provide a conducive learning experience to their students.\n\n"
                        +
                        "Major in: Science";
                JOptionPane.showMessageDialog(UpangIS.this, bsedScienceDetails);
            }
        });
        celaPanel.add(bsedScienceButton);

        JButton bsedSocialStudiesButton = new JButton("Bachelor of Secondary Education Major in Social Studies");
        bsedSocialStudiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsedSocialStudiesDetails = "Bachelor of Secondary Education Major in Social Studies\n\n" +
                        "Bachelor of Secondary Education (BSED) is a four year degree program designed to prepare students for becoming high school teachers.\n\n"
                        +
                        "The program combines both theory and practice in order to teach students the necessary knowledge and skills a high school teacher needs.\n\n"
                        +
                        "The program aims to produce competent teachers who provide a conducive learning experience to their students.\n\n"
                        +
                        "Major in: Social Studies";
                JOptionPane.showMessageDialog(UpangIS.this, bsedSocialStudiesDetails);
            }
        });
        celaPanel.add(bsedSocialStudiesButton);

        JButton celaBackButton = new JButton("Back");
        celaBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
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

        JButton bsCrimButton = new JButton("Bachelor of Science in Criminology");
        bsCrimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsCrimDetails = "Bachelor of Science in Criminology\n\n" +
                        "The Bachelor of Science in Criminology program is a four-year course that provides students with knowledge and skills in forensic science, criminal jurisprudence, law enforcement, criminal investigation, and correctional administration.\n\n"
                        +
                        "We train our students to be efficient and effective public safety and security while maintaining human rights.\n\n"
                        +
                        "We also teach them the importance of nationalism and nation-building through protection.";
                JOptionPane.showMessageDialog(UpangIS.this, bsCrimDetails);
            }
        });
        ccjePanel.add(bsCrimButton);

        JButton ccjeBackButton = new JButton("Back");
        ccjeBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        ccjePanel.add(ccjeBackButton);
        contentPane.add(ccjeScrollPane, "ccje");

        // College of Engineering and Architecture Panel
        ceaPanel = new JPanel();
        ceaPanel.setLayout(new BoxLayout(ceaPanel, BoxLayout.Y_AXIS));
        ceaPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane ceaScrollPane = new JScrollPane(ceaPanel);
        ceaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JButton bsArchButton = new JButton("Bachelor of Science in Architecture");
        bsArchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsArchDetails = "Bachelor of Science in Architecture\n\n" +
                        "The Bachelor of Architecture program is a comprehensive and innovative course designed to cultivate the skills, knowledge, and creative vision necessary for a successful career in architecture.\n\n"
                        +
                        "Our curriculum seamlessly integrates theoretical principles with hands-on design projects, providing students with a solid foundation in architectural theory, history, and technical expertise.\n\n"
                        +
                        "Through studio-based learning and real-world applications, students develop the ability to conceptualize and bring to life architectural designs that are both aesthetically compelling and functionally sound.\n\n"
                        +
                        "Graduates of our program are well-prepared to embark on diverse career paths in architecture, urban planning, sustainable design, and other related fields, contributing to the built environment with ingenuity and expertise.";
                JOptionPane.showMessageDialog(UpangIS.this, bsArchDetails);
            }
        });
        ceaPanel.add(bsArchButton);

        JButton bsCompEngButton = new JButton("Bachelor of Science in Computer Engineering");
        bsCompEngButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsCompEngDetails = "Bachelor of Science in Computer Engineering\n\n" +
                        "The Bachelor of Science in Computer Engineering (BS Computer Engineering) program is a dynamic and rigorous course designed to prepare students for the ever-evolving field of computer engineering.\n\n"
                        +
                        "Our curriculum combines theoretical foundations with hands-on practical experience, ensuring students acquire a strong understanding of both hardware and software aspects of computing systems.\n\n"
                        +
                        "Through courses in digital systems, computer architecture, programming, and electronics, students develop the skills necessary for designing and implementing innovative solutions.\n\n"
                        +
                        "The program emphasizes problem-solving, critical thinking, and teamwork, essential for addressing the challenges of the digital age.\n\n"
                        +
                        "Graduates are well-equipped for careers in areas such as embedded systems, networking, software development, and hardware design, contributing to advancements in technology and computing.";
                JOptionPane.showMessageDialog(UpangIS.this, bsCompEngDetails);
            }
        });
        ceaPanel.add(bsCompEngButton);

        JButton bsCivEngButton = new JButton("Bachelor of Science in Civil Engineering");
        bsCivEngButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsCivEngDetails = "Bachelor of Science in Civil Engineering\n\n" +
                        "The Bachelor of Science in Civil Engineering program is a four-year course that teaches students the knowledge, skills, and training necessary for designing, constructing and maintaining buildings, and public infrastructure and facilities.\n\n"
                        +
                        "We also develop their zest for excellence and lifelong training necessary for adapting to civil engineering trends.\n\n"
                        +
                        "Graduates of the BS Civil Engineering program must take the board exams conducted by the Professional Regulation Commission to become professionals.";
                JOptionPane.showMessageDialog(UpangIS.this, bsCivEngDetails);
            }
        });
        ceaPanel.add(bsCivEngButton);

        JButton bsElecEngButton = new JButton("Bachelor of Science in Electrical Engineering");
        bsElecEngButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsElecEngDetails = "Bachelor of Science in Electrical Engineering\n\n" +
                        "The Bachelor of Science in Electrical Engineering is a five-year degree program that focuses on conceptualizing, developing, and designing a safe, economical, and ethical utilization of electrical energy.\n\n"
                        +
                        "The program also trains students to effectively develop and test real-life applications of electrical circuitry, digital systems, electrical equipment, and machinery control.";
                JOptionPane.showMessageDialog(UpangIS.this, bsElecEngDetails);
            }
        });
        ceaPanel.add(bsElecEngButton);

        JButton bsMechEngButton = new JButton("Bachelor of Science in Mechanical Engineering");
        bsMechEngButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsMechEngDetails = "Bachelor of Science in Mechanical Engineering\n\n" +
                        "The Bachelor of Science in Mechanical Engineering is a comprehensive and dynamic degree program dedicated to equipping students with the knowledge and skills essential for conceptualizing, designing, and optimizing mechanical systems.\n\n"
                        +
                        "Our curriculum emphasizes the safe, cost-effective, and ethical utilization of energy in mechanical processes.\n\n"
                        +
                        "Students are trained to proficiently develop and test real-world applications of mechanical principles, including machinery design, thermodynamics, fluid mechanics, and materials science.\n\n"
                        +
                        "Through a blend of theoretical knowledge and practical experience, graduates of our program are well-prepared to contribute to industries such as manufacturing, automotive, aerospace, and energy, where they play a crucial role in innovation, problem-solving, and the advancement of mechanical technology.";
                JOptionPane.showMessageDialog(UpangIS.this, bsMechEngDetails);
            }
        });
        ceaPanel.add(bsMechEngButton);

        JButton ceaBackButton = new JButton("Back");
        ceaBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        ceaPanel.add(ceaBackButton);
        contentPane.add(ceaScrollPane, "cea");

        // College of Allied Health Sciences Panel
        cahsPanel = new JPanel();
        cahsPanel.setLayout(new BoxLayout(cahsPanel, BoxLayout.Y_AXIS));
        cahsPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane cahsScrollPane = new JScrollPane(cahsPanel);
        cahsScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JButton bsNursingButton = new JButton("Bachelor of Science in Nursing");
        bsNursingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsNursingDetails = "Bachelor of Science in Nursing\n\n" +
                        "The Bachelor of Science Nursing program is a four-year course where we teach students nursing concepts alongside Related Learning Experiences (RLE).\n\n"
                        +
                        "Through our outcome-based curriculum, we train students to become competent through simulated clinical and active learning activities.\n\n"
                        +
                        "Our program also provides an intensive nursing practicum that will make our students skilled, refined, and worthy of entering the nursing profession.";
                JOptionPane.showMessageDialog(UpangIS.this, bsNursingDetails);
            }
        });
        cahsPanel.add(bsNursingButton);

        JButton bsPharmacyButton = new JButton("Bachelor of Science in Pharmacy");
        bsPharmacyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsPharmacyDetails = "Bachelor of Science in Pharmacy\n\n" +
                        "The Bachelor of Science in Pharmacy program is a four-year course which focuses on teaching necessary foundational knowledge for pharmaceutical product development.\n\n"
                        +
                        "Through our program, we teach students on the essentials of pharmaceutical chemistry, pharmaceutics, and the life sciences.\n\n"
                        +
                        "During their fourth year, we will assign students to intern in various CHED-accredited affiliated establishments to learn about the rigors of pharmacy practice.\n\n"
                        +
                        "Their internship will expose them to various practice areas and prepare them for the roles they may take on after graduation.\n\n"
                        +
                        "Graduates of the BS Pharmacy program must take the board exams conducted by the Professional Regulation Commission to qualify as registered pharmacists.";
                JOptionPane.showMessageDialog(UpangIS.this, bsPharmacyDetails);
            }
        });
        cahsPanel.add(bsPharmacyButton);

        JButton bmlsButton = new JButton("Bachelor in Medical Laboratory Science");
        bmlsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bmlsDetails = "Bachelor in Medical Laboratory Science\n\n" +
                        "The Bachelor of Science in Medical Laboratory Science is a four-year program that provides knowledge in the fields of Clinical Chemistry, Hematology, Microbiology, Immunohematology, Immunology and Serology, Urinalysis, Clinical Microscopy, Parasitology, Cytology, and Histopathology.\n\n"
                        +
                        "During their fourth year, students undergo an internship program in a CHED-accredited training laboratory where they rotate between sections.\n\n"
                        +
                        "Graduates of the program must take the board exams conducted by the Professional Regulation Commission to qualify as registered medical technologists.";
                JOptionPane.showMessageDialog(UpangIS.this, bmlsDetails);
            }
        });
        cahsPanel.add(bmlsButton);

        JButton bsPsychologyButton = new JButton("Bachelor of Science in Psychology");
        bsPsychologyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsPsychologyDetails = "Bachelor of Science in Psychology\n\n" +
                        "The Bachelor of Science in Psychology program focuses on the comprehensive understanding of human behavior and mental processes.\n\n"
                        +
                        "Our curriculum is designed to provide students with a strong foundation in psychological theories, research methods, and practical skills.\n\n"
                        +
                        "We emphasize the development of critical thinking, ethical reasoning, and effective communication skills to prepare graduates for a successful career in the field of psychology.\n\n"
                        +
                        "Future Career Graduates of our Bachelor of Science in Psychology program have diverse career opportunities in various industries.\n\n"
                        +
                        "They can pursue careers as psychologists, counselors, human resource professionals, research analysts, or social service providers in settings such as hospitals, clinics, educational institutions, government agencies, or nonprofit organizations.\n\n"
                        +
                        "With their strong foundation in psychology, graduates can excel in roles such as clinical psychologists, counseling psychologists, industrial-organizational psychologists, or educational psychologists, contributing to mental well-being, performance improvement, and community development.\n\n"
                        +
                        "They may also specialize in areas such as child psychology, forensic psychology, sports psychology, or health psychology, and have the option to pursue advanced degrees to enhance their knowledge and career prospects.";
                JOptionPane.showMessageDialog(UpangIS.this, bsPsychologyDetails);
            }
        });
        cahsPanel.add(bsPsychologyButton);

        JButton cahsBackButton = new JButton("Back");
        cahsBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        cahsPanel.add(cahsBackButton);
        contentPane.add(cahsScrollPane, "cahs");

        // College of Information Technology Panel
        citPanel = new JPanel();
        citPanel.setLayout(new BoxLayout(citPanel, BoxLayout.Y_AXIS));
        citPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JScrollPane citScrollPane = new JScrollPane(citPanel);
        citScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JButton bsItButton = new JButton("Bachelor of Science in Information Technology");
        bsItButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bsItDetails = "Bachelor of Science in Information Technology\n\n" +
                        "The Bachelor of Science in Information Technology program provides students with skills and knowledge needed in relevant emerging high-growth areas in the industry.\n\n"
                        +
                        "Through our program, we train students with the development and management of contemporary areas such as cloud computing and applications, analytics and data science, artificial intelligence, and the Internet of Things.\n\n"
                        +
                        "We use a curriculum based on inputs and guidance from practicing industry experts.";
                JOptionPane.showMessageDialog(UpangIS.this, bsItDetails);
            }
        });
        citPanel.add(bsItButton);

        JButton citBackButton = new JButton("Back");
        citBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });
        citPanel.add(citBackButton);
        contentPane.add(citScrollPane, "cit");

        JButton phinmaScholarshipButton = new JButton("1. PHINMA Scholarship (formerly Presidential Scholarship)");
        phinmaScholarshipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String scholarshipDetails = "Benefits:\n" +
                        "100% discount on tuition & miscellaneous fees for 4 or 5 years\n" +
                        "₱4,000 monthly allowance for Honors or Top 10 Grade 12 students who passed the qualifying exam.\n\n"
                        +
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
                        "100% coverage of tuition fees for the top 10 for the semester following the Dean’s List award\n"
                        +
                        "50% off the tuition fee for the top 11-25 for the semester following the Dean’s List award\n\n"
                        +
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
                        "The student must be a part of the top 11-25 of the Dean’s List who are not Presidential, Gov. Moreno, OJH, 1 of 100, or College scholar.\n"
                        +
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

        JButton victoryLinerButton = new JButton(
                "8. Victory Liner, 5-Star, and Transasia Oil Employee & Direct Dependent Scholarship");

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
                        "10% off the tuition for 2 siblings, plus 5% to each additional sibling enrolled in the University (basic education or college)\n\n"
                        +
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
                        "10% off the tuition fee for graduates of the University (including Basic Education) and their direct dependents\n\n"
                        +
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
                setSize(600, 600);
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
                setSize(600, 600);
                setLocationRelativeTo(null);
            }
        });

        courseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPane, "course");
                setSize(600, 600);
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
