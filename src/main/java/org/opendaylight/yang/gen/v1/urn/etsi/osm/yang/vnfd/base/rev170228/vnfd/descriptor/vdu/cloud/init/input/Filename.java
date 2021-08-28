package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.CloudInitInput;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case filename {
 *   leaf cloud-init-file {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/cloud-init-input/filename</i>
 *
 */
public interface Filename
    extends
    DataObject,
    Augmentable<Filename>,
    CloudInitInput
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("filename");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename.class;
    }
    
    /**
     * Name of file with contents of cloud-init script in cloud-config format
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cloudInitFile</code>, or <code>null</code> if not present
     */
    @Nullable String getCloudInitFile();

}

