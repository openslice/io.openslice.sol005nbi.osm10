package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.vnf.out.list;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.VnfOutList;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.common.Uint32;

/**
 * List of service primitives supported by the configuration agent for this VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnf-out-primitive {
 *   key index;
 *   leaf index {
 *     type uint32;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   uses manotypes:primitive-parameter-value;
 *   leaf execution-id {
 *     type string;
 *   }
 *   leaf execution-status {
 *     type string;
 *   }
 *   leaf execution-error-details {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-config-primitive/output/vnf-out-list/vnf-out-primitive</i>
 * 
 * <p>To create instances of this class use {@link VnfOutPrimitiveBuilder}.
 * @see VnfOutPrimitiveBuilder
 * @see VnfOutPrimitiveKey
 *
 */
public interface VnfOutPrimitive
    extends
    ChildOf<VnfOutList>,
    Augmentable<VnfOutPrimitive>,
    PrimitiveParameterValue,
    Identifiable<VnfOutPrimitiveKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-out-primitive");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.vnf.out.list.VnfOutPrimitive> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.vnf.out.list.VnfOutPrimitive.class;
    }
    
    /**
     * index of the service primitive.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.common.Uint32</code> <code>index</code>, or <code>null</code> if not present
     */
    @Nullable Uint32 getIndex();
    
    /**
     * Name of the service primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Execution id of this primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>executionId</code>, or <code>null</code> if not present
     */
    @Nullable String getExecutionId();
    
    /**
     * Status of the execution of this primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>executionStatus</code>, or <code>null</code> if not present
     */
    @Nullable String getExecutionStatus();
    
    /**
     * Error details if execution-status is failed
     *
     *
     *
     * @return <code>java.lang.String</code> <code>executionErrorDetails</code>, or <code>null</code> if not present
     */
    @Nullable String getExecutionErrorDetails();
    
    @Override
    VnfOutPrimitiveKey key();

}

