/*
 * The MIT License
 *
 * Copyright 2014 thbounzer.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package thebounzer.org.thboglutils;


/**
 *
 * @author thbounzer
 */
public class ColorImplementation implements Color{

    private float[] RGBACombination = new float[4];
    private static final int R = 0;
    private static final int G = 1;
    private static final int B = 2;
    private static final int A = 3;
    
    @Override
    public Object green() {
        generateColor(0.0f, 1.0f, 0.0f, 0.0f);
        return RGBACombination;        
    }

    @Override
    public Object red() {
        generateColor(1.0f, 0.0f, 0.0f, 0.0f);
        return RGBACombination;
    }

    @Override
    public Object blue() {
        generateColor(0.0f, 0.0f, 1.0f, 0.0f);
        return RGBACombination;
    }

    @Override
    public Object white() {
        generateColor(1.0f, 1.0f, 1.0f,0.0f);
        return RGBACombination;
    }

    @Override
    public Object black() {
        generateColor(0.0f, 0.0f, 0.0f, 0.0f);
        return RGBACombination;
    }
    
    private void generateColor(float r,float g,float b, float a){
        RGBACombination[R] = r;
        RGBACombination[G] = g;
        RGBACombination[B] = b;
        RGBACombination[A] = a;
    }
    
    
    
}
