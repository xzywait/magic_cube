package jiabin.jogl;

public class MagicCube {

	public static void main(String[] args) {
		GLDisplay myGLDisplay = GLDisplay.createGLDisplay("��OJGL����ħ����Ϸ");  
        CubeRenderer cubeRenderer = new CubeRenderer();  
        //����һ�����̴���  
        KeyHandler keyHandler = new KeyHandler(cubeRenderer, myGLDisplay);  
        
        //����һ��������  
        MouseHandler mouseHander = new MouseHandler(cubeRenderer, myGLDisplay);
  
        //ע��GLEvent���� 
        myGLDisplay.addGLEventListener(cubeRenderer);  
        //ע����̼���  
        myGLDisplay.addKeyListener(keyHandler); 
        
        //ע�������� 
        myGLDisplay.addMouseMotionListener(mouseHander);
        myGLDisplay.addMouseListener(mouseHander);
        myGLDisplay.start();    
	}
}
