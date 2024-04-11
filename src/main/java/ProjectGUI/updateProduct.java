package ProjectGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class updateProduct extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JLabel lblNewLabel_1;
	private JTextField sellingprice;
	private JTextField markedprice;
	private JTextField purchasedprice;
	private JTextField expirydate;
	private JTextField barcode;
	private JTextField hsn;
	private JTextField tax;
	private JTextField category;
	private JTextField subcategory;
	private JTextField quantity;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @param quantity2 
	 * @param sellingprice2 
	 * @param markedprice2 
	 * @param purchasedprice2 
	 * @param tax2 
	 * @param expirydate2 
	 * @param subcategory2 
	 * @param category2 
	 * @param hsn2 
	 * @param name2 
	 */
	public updateProduct(String id, String name2, String hsn2, String category2, String subcategory2, String expirydate2, String tax2, String purchasedprice2, String markedprice2, String sellingprice2, String quantity2) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Name:");
		lblNewLabel.setBounds(186, 23, 45, 13);
		contentPane.add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(269, 17, 184, 19);
		name.setText(name2);
		contentPane.add(name);
		name.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Selling Price:");
		lblNewLabel_1.setBounds(167, 52, 99, 13);
		contentPane.add(lblNewLabel_1);
		
		sellingprice = new JTextField();
		sellingprice.setColumns(10);
		sellingprice.setBounds(269, 46, 184, 19);
		sellingprice.setText(sellingprice2);
		contentPane.add(sellingprice);
		
		markedprice = new JTextField();
		markedprice.setColumns(10);
		markedprice.setBounds(269, 75, 184, 19);
		markedprice.setText(markedprice2);
		contentPane.add(markedprice);
		
		purchasedprice = new JTextField();
		purchasedprice.setColumns(10);
		purchasedprice.setBounds(269, 104, 184, 19);
		purchasedprice.setText(purchasedprice2);
		contentPane.add(purchasedprice);
		
		expirydate = new JTextField();
		expirydate.setColumns(10);
		expirydate.setBounds(269, 133, 184, 19);
		expirydate.setText(expirydate2);
		contentPane.add(expirydate);
		
		barcode = new JTextField();
		barcode.setColumns(10);
		barcode.setBounds(269, 162, 184, 19);
		barcode.setText(id);
		contentPane.add(barcode);
		
		hsn = new JTextField();
		hsn.setColumns(10);
		hsn.setBounds(269, 191, 184, 19);
		hsn.setText(hsn2);
		contentPane.add(hsn);
		
		tax = new JTextField();
		tax.setColumns(10);
		tax.setBounds(269, 220, 184, 19);
		tax.setText(tax2);
		contentPane.add(tax);
		
		category = new JTextField();
		category.setColumns(10);
		category.setBounds(269, 249, 184, 19);
		category.setText(category2);
		contentPane.add(category);
		
		subcategory = new JTextField();
		subcategory.setColumns(10);
		subcategory.setBounds(269, 278, 184, 19);
		subcategory.setText(subcategory2);
		contentPane.add(subcategory);
		
		quantity = new JTextField();
		quantity.setColumns(10);
		quantity.setBounds(269, 307, 184, 19);
		quantity.setText(quantity2);
		contentPane.add(quantity);
		
		lblNewLabel_2 = new JLabel("Marked Price:");
		lblNewLabel_2.setBounds(167, 81, 99, 13);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Purchased Price:");
		lblNewLabel_3.setBounds(160, 110, 99, 13);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Expiry Date:");
		lblNewLabel_4.setBounds(170, 139, 72, 13);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Barcode:");
		lblNewLabel_5.setBounds(181, 168, 85, 13);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("HSN:");
		lblNewLabel_6.setBounds(186, 197, 65, 13);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Tax:");
		lblNewLabel_7.setBounds(186, 226, 72, 13);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Category:");
		lblNewLabel_8.setBounds(177, 255, 85, 13);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Sub Category:");
		lblNewLabel_9.setBounds(167, 284, 99, 13);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Quantity:");
		lblNewLabel_10.setBounds(177, 313, 65, 13);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.setBounds(269, 362, 85, 27);
		contentPane.add(btnNewButton);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(368, 362, 85, 27);
		contentPane.add(btnDelete);
	}
}
