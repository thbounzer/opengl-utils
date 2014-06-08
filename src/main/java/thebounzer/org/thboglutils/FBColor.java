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

import java.nio.FloatBuffer;

/**
 *
 * @author thbounzer
 */
public class FBColor extends ColorImplementation{
    
    private float[] color;
    
    @Override
    public FloatBuffer black() {
        color = (float[]) super.black(); 
        return FloatBuffer.wrap(color);
    }

    @Override
    public FloatBuffer white() {
        color = (float[]) super.white();
        return FloatBuffer.wrap(color);
    }

    @Override
    public FloatBuffer blue() {
        color = (float[]) super.blue();
        return FloatBuffer.wrap(color);
    }

    @Override
    public FloatBuffer red() {
        color = (float[]) super.red();
        return FloatBuffer.wrap(color);
    }

    @Override
    public FloatBuffer green() {
        color = (float[]) super.green();
        return FloatBuffer.wrap(color);
    }

    
}
