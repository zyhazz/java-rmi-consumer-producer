package buffer;

public class Buffer {
	private static final Object lock = new Object();
	private static volatile Buffer instance;
	
	private static int buffer = 0;
	
	public int getBuffer() {
		System.out.println("buf" + buffer);
		return buffer;
	}
	public int consome() {
		System.out.println("buf" + (buffer-1));
		return buffer--;
	}
	public int produz() {
		System.out.println("buf" + (buffer+1));
		return buffer++;
	}
	public static Buffer getInstance() {
	    Buffer r = instance;
	    if (r == null) {
	        synchronized (lock) {    // While we were waiting for the lock, another 
	            r = instance;        // thread may have instantiated the object.
	            if (r == null) {  
	                r = new Buffer();
	                instance = r;
	            }
	        }
	    }
	    return r;
	}
}
