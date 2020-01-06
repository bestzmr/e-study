$(function () {
	$("#province").change(function () {
		collegeOnchange()
	});
});
function selectOnchang(obj) {
	//获取被选中的option标签选项
	$("#selectContent").empty();
	var value = obj.options[obj.selectedIndex].value;
	// alert(value);
	ajax_get("http://localhost:8080/HighSchool/getAllHighSchools",{},function (data) {
		var highSchoolObj = JSON.parse(data);
		for (var i = 0; i < highSchoolObj.length; i++) {
			if (value == highSchoolObj[i][middleschool_config.highschoolArea]) {
				$("#selectContent").append('<p>' + highSchoolObj[i][middleschool_config.highschoolName] + '</p>');
			}
		}
	});
}

function collegeOnchange() {
	// 清空table
	let html = '<thead>\n' +
		'                            <tr>\n' +
		'                                <th style="text-align: center; width: 200px;">学校</th>\n' +
		'                                <th style="text-align: center;">类型</th>\n' +
		'                                <th style="text-align: center;">2017分数</th>\n' +
		'                                <th style="text-align: center;">2018分数</th>\n' +
		'                                <th style="text-align: center;">2019分数</th>\n' +
		'                            </tr>\n' +
		'                            </thead>\n' +
		'                            <tbody id="collegeContentT"></tbody>';
	$("#collegeContent").empty().append(html);


	// college_info = obj.options[obj.selectedIndex].value;
	ajax_get("http://localhost:8080/College/listByQuery",{},function (data) {
		let value1 = $("#province").val();
		let collegeObj = JSON.parse(data);
		for (let i = 0; i < collegeObj.length; i++) {
			// console.log(collegeObj[0].collegeInfo.area);
			if (value1 == collegeObj[i].collegeInfo.area) {
				let type = "|";
				if(collegeObj[i].collegeInfo.isArt == true){
					type += "艺术|";
				}else if(collegeObj[i].collegeInfo.isDoubleFirst == true) {
					type += "双一流|";
				}else if(collegeObj[i].collegeInfo.isKey == true) {
					type += "重点|";
				}else if(collegeObj[i].collegeInfo.isUndergraduate == true) {
					type += "本科|";
				}else {
					type += "专科|";
				}

				// console.log(collegeObj[i].collegeInfo.name);
				$("#collegeContentT").append('' +
					'<tr><td><' +
					'a href="' + collegeObj[i].collegeInfo.url + '">' + collegeObj[i].collegeInfo.name + '</a>' +
					'</td><td>'+type+'</td><td>' +
					collegeObj[i].admissionInfos[0].score + '</td><td>' + collegeObj[i].admissionInfos[1]
					.score + '</td><td>' + collegeObj[i].admissionInfos[2].score + '</td></tr>');
			}
		}
	});
}
