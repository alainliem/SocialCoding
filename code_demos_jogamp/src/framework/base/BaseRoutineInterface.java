package framework.base;

/**
 **   __ __|_  ___________________________________________________________________________  ___|__ __
 **  //    /\                                           _                                  /\    \\  
 ** //____/  \__     __ _____ _____ _____ _____ _____  | |     __ _____ _____ __        __/  \____\\ 
 **  \    \  / /  __|  |     |   __|  _  |     |  _  | | |  __|  |     |   __|  |      /\ \  /    /  
 **   \____\/_/  |  |  |  |  |  |  |     | | | |   __| | | |  |  |  |  |  |  |  |__   "  \_\/____/   
 **  /\    \     |_____|_____|_____|__|__|_|_|_|__|    | | |_____|_____|_____|_____|  _  /    /\     
 ** /  \____\                       http://jogamp.org  |_|                              /____/  \    
 ** \  /   "' _________________________________________________________________________ `"   \  /    
 **  \/____.                                                                             .____\/     
 **             
 ** Interface to be implemented by all demonstration routines. Provides method prototypes
 ** for initialization, runtime and end/cleanup of a routine.
 **
 **/

import javax.media.opengl.*;
import javax.media.opengl.glu.*;
import com.jogamp.opengl.util.gl2.*;

public interface BaseRoutineInterface {

    public void initRoutine(GL2 inGL,GLU inGLU,GLUT inGLUT);
    public void mainLoop(int inFrameNumber,GL2 inGL,GLU inGLU,GLUT inGLUT);
    public void cleanupRoutine(GL2 inGL,GLU inGLU,GLUT inGLUT);

}
