package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of input parameters
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list input-parameter {
 *   key xpath;
 *   leaf xpath {
 *     type string;
 *   }
 *   leaf value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/input-parameter/input-parameter</i>
 * 
 * <p>To create instances of this class use {@link InputParameterBuilder}.
 * @see InputParameterBuilder
 * @see InputParameterKey
 *
 */
public interface InputParameter
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.InputParameter>,
    Augmentable<InputParameter>,
    Identifiable<InputParameterKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("input-parameter");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.InputParameter> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter.InputParameter.class;
    }
    
    /**
     * An xpath that specfies which element in a descriptor is to be modified.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>xpath</code>, or <code>null</code> if not present
     */
    @Nullable String getXpath();
    
    /**
     * The value that the element specified by the xpath should take when a record is
     * created.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable String getValue();
    
    @Override
    InputParameterKey key();

}

