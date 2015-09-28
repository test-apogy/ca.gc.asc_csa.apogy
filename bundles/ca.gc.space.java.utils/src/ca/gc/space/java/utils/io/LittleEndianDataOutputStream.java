/*
 * Copyright (C) 2007 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ca.gc.space.java.utils.io;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class LittleEndianDataOutputStream extends OutputStream implements
		DataOutput {

	private DataOutputStream out;

	public LittleEndianDataOutputStream(OutputStream output) {
		this.out = new DataOutputStream(output);
	}

	@Override
	public void write(int b) throws IOException {
		out.write(b);
	}

	@Override
	public void write(byte[] b) throws IOException {
		out.write(b);
	}

	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		out.write(b, off, len);
	}

	@Override
	public void writeBoolean(boolean v) throws IOException {
		out.write(v ? 1 : 0);
	}

	@Override
	public void writeByte(int v) throws IOException {
		out.write(v);
	}

	@Override
	public void writeShort(int v) throws IOException {
		int v0 = 0xff & v;
		int v1 = 0xff & (v >> 8);
		out.write(v0);
		out.write(v1);
	}

	@Override
	public void writeChar(int v) throws IOException {
		writeShort(v);
	}

	@Override
	public void writeInt(int v) throws IOException {
		int v0 = 0xff & v;
		int v1 = 0xff & (v >> 8);
		int v2 = 0xff & (v >> 16);
		int v3 = 0xff & (v >> 24);

		out.write(v0);
		out.write(v1);
		out.write(v2);
		out.write(v3);
	}

	@Override
	public void writeLong(long v) throws IOException {
		byte[] byteArray = new byte[] { (byte) (0xff & v),
				(byte) (0xff & (v >> 8)), (byte) (0xff & (v >> 16)),
				(byte) (0xff & (v >> 24)), (byte) (0xff & (v >> 32)),
				(byte) (0xff & (v >> 40)), (byte) (0xff & (v >> 48)),
				(byte) (0xff & (v >> 56)) };

		out.write(byteArray, 0, byteArray.length);
	}

	@Override
	public void writeFloat(float v) throws IOException {
		writeInt(Float.floatToIntBits(v));
	}

	@Override
	public void writeDouble(double v) throws IOException {
		writeLong(Double.doubleToLongBits(v));
	}

	@Override
	public void writeBytes(String s) throws IOException {
		write(s.getBytes(), 0, s.getBytes().length);

	}

	@Override
	public void writeChars(String s) throws IOException {
		for (int i = 0; i < s.length(); i++) {
			writeChar(s.charAt(i));
		}
	}

	@Override
	public void writeUTF(String s) throws IOException {
		out.writeUTF(s);
	}

	@Override
	public void flush() throws IOException {
		out.flush();
	}

}
