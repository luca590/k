package org.kframework.backend.java.kil;

/**
 * The tag interface for immutable {@code Term}s. For now, the only subclass of
 * {@code Term} that can be directly mutated is the {@code Cell} class.
 * Therefore, immutable terms are {@code Term}s that cannot contain {@code Cell}
 * as their sub-terms.
 * 
 * @author YilongL
 * 
 */
public interface Immutable {

}
