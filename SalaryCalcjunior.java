аpackage SalaryCalc;

//добавляем библиотеки для работы с текстовыми полями, метками, 
//для создания графического окна
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

//Главный класс, реализуюй интерфейс ActionListener
//Интерфейс нужен для обработки события нажатия на кнопку
public class SalaryCalcjunior implements ActionListener{

    
    JFrame frame = new JFrame("Калькулятор промежуточной зарплаты"); //главное окно
    JPanel panelLeft = new JPanel(); //панель с метками
    JPanel panelRight = new JPanel(); //панель с текстовыми полями
    JPanel panelBottom = new JPanel(); //панель с кнопками 
    public JTextField[] arrTf = new JTextField[4];//массив текстовых полей
    
    
    //конструктор
    public SalaryCalcjunior(){
        
        //устанавливаем менеджер компоновки для панели с метками
        //делаем выравнивание по вертикали
        panelLeft.setLayout(new BoxLayout(panelLeft, BoxLayout.Y_AXIS));
        //устанавлиаем  размер 250 на 300 пикселей
        panelLeft.setPreferredSize(new Dimension(250, 300));
        
        //устанавливаем менеджер компоновки для панели с текстовыми полями
        //делаем выравнивание по вертикали
        panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
        //устанавливаем  размер 130 на 300 пикселей
        panelRight.setPreferredSize(new Dimension(130,300));
        
        //добавлям метки через метод addLabel
        addLabel(panelLeft, "Тарифная ставка (в час):", Color.RED);
        addLabel(panelLeft, "Рабочий день (часы):", Color.RED);
        addLabel(panelLeft, "Количество отработанных дней:", Color.RED);
        addLabel(panelLeft, "Промежуточная зарплата:", Color.BLUE);
        
        //добавляем текстовые поля через цикл и записываем их в массив
        for(int i=0; i<arrTf.length; i++){
            //записываем ссылку из метода в массив для дальнейшей работы с 
            //тестовым полем
            arrTf[i] = addTextField(panelRight);
        }
 