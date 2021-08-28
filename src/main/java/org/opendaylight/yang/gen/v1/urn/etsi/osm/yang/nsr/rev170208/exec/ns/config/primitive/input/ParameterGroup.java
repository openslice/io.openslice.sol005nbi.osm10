package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.input;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ExecNsConfigPrimitiveInput;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of NS Primitive parameter groups
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list parameter-group {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   uses manotypes:primitive-parameter-value;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-config-primitive/input/parameter-group</i>
 * 
 * <p>To create instances of this class use {@link ParameterGroupBuilder}.
 * @see ParameterGroupBuilder
 * @see ParameterGroupKey
 *
 */
public interface ParameterGroup
    extends
    ChildOf<ExecNsConfigPrimitiveInput>,
    Augmentable<ParameterGroup>,
    PrimitiveParameterValue,
    Identifiable<ParameterGroupKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("parameter-group");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.input.ParameterGroup> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.input.ParameterGroup.class;
    }
    
    /**
     * Name of the parameter.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    @Override
    ParameterGroupKey key();

}

