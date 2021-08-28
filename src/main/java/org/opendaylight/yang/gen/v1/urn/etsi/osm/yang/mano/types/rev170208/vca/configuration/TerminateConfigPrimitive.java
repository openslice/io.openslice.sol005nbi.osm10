package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint64;

/**
 * Terminate set of configuration primitives.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list terminate-config-primitive {
 *   key seq;
 *   leaf seq {
 *     type uint64;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf execution-environment-ref {
 *     type leafref {
 *       path ../../execution-environment-list/id;
 *     }
 *   }
 *   uses primitive-parameter-value;
 *   leaf user-defined-script {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/terminate-config-primitive</i>
 * 
 * <p>To create instances of this class use {@link TerminateConfigPrimitiveBuilder}.
 * @see TerminateConfigPrimitiveBuilder
 * @see TerminateConfigPrimitiveKey
 *
 */
public interface TerminateConfigPrimitive
    extends
    ChildOf<VcaConfiguration>,
    Augmentable<TerminateConfigPrimitive>,
    PrimitiveParameterValue,
    Identifiable<TerminateConfigPrimitiveKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("terminate-config-primitive");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.TerminateConfigPrimitive> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.TerminateConfigPrimitive.class;
    }
    
    /**
     * Sequence number for the configuration primitive.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint64</code> <code>seq</code>, or <code>null</code> if not present
     */
    @Nullable Uint64 getSeq();
    
    /**
     * Name of the configuration primitive in the execution environment.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Leaf reference to the particular execution environment
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>executionEnvironmentRef</code>, or <code>null</code> if not present
     */
    @Nullable Object getExecutionEnvironmentRef();
    
    /**
     * A user defined script.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    @Nullable String getUserDefinedScript();
    
    @Override
    TerminateConfigPrimitiveKey key();

}

